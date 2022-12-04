package pairmatching.domain;

import pairmatching.service.PairMatchingService;

public class PairMatchingGame {
    private final PairMatchingService pairMatchingService = new PairMatchingService();

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
        return true;
    }

    private boolean wantQuit() {
        return true;
    }



}
