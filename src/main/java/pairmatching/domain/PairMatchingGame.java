package pairmatching.domain;

import pairmatching.domain.enums.Answer;
import pairmatching.domain.enums.Course;
import pairmatching.domain.enums.Level;
import pairmatching.domain.enums.Menu;
import pairmatching.service.PairMatchingService;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class PairMatchingGame {
    private final PairMatchingService pairMatchingService = new PairMatchingService();
    private final PairMatchingFactory pairMatchingFactory = new PairMatchingFactory();
    private Menu menuNumber;

    public void start() {
        while (selectMenu());
    }

    private boolean selectMenu() {
        while (select() && !wantQuit()) {
            doMenu();
        }
        return false;
    }

    private void doMenu() {
        if (menuNumber == Menu.INITIALIZE) {
            pairMatchingService.clearAll();
            OutputView.printInitialized();
            return;
        }
        OutputView.printStage();
        if (menuNumber == Menu.MATCHING) {
            while (pairMatchingService.isAlreadyMatched(InputView.readStage()) && isNo(InputView.readAnswer()));
            pairMatchingService.pairMatching(pairMatchingFactory.makeCrew());
            OutputView.printResult(pairMatchingService.getPair());
        }
        if (menuNumber == Menu.SEARCH) {
            String[] stageArr = InputView.readStage().split(", ");
            Stage stage = new Stage(Course.findCourse(stageArr[0]), Level.findLevel(stageArr[1]), stageArr[2]);
            OutputView.printResult(pairMatchingService.searchPair(stage));
        }
    }

    private boolean isNo(String answer) {
        return Answer.findAnswer(answer) == Answer.NO;
    }

    private boolean select() {
        menuNumber = Menu.findMenu(InputView.readMenuNumber());
        return true;
    }

    private boolean wantQuit() {
        return menuNumber.isQuit();
    }
}
