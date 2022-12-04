package pairmatching.domain;

import pairmatching.domain.enums.Menu;
import pairmatching.service.PairMatchingService;
import pairmatching.view.InputView;

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

    }

    private boolean select() {
        menuNumber = Menu.findMenu(InputView.readMenuNumber());
        return true;
    }

    private boolean wantQuit() {
        return menuNumber.isQuit();
    }



}
