package pairmatching.domain;

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
        OutputView.printStage();
        if (menuNumber == Menu.MATCHING) {
            while (pairMatchingService.isAlreadyMatched(InputView.readStage()) && isNo(InputView.readAnswer()));
        }
    }

    private boolean isNo(String answer) {
        return true;
    }

    private boolean select() {
        menuNumber = Menu.findMenu(InputView.readMenuNumber());
        return true;
    }

    private boolean wantQuit() {
        return menuNumber.isQuit();
    }



}
