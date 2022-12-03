package pairmatching.domain;

import pairmatching.view.InputView;

public class PairMatchingGame {
    private final PairMatchingDB pairMatchingDB;

    public PairMatchingGame() {
        this.pairMatchingDB = new PairMatchingDB();
    }

    public void start() {
        while(true) {
            selectOption();
            if (pairMatchingDB.isQuit()) {
                break;
            }
            doMatchGame();
        }
    }

    public void selectOption() {
        pairMatchingDB.selectMenu(InputView.readOption());
    }

    private void doMatchGame() {
        if (pairMatchingDB.isMatch()) {
            System.out.println("Match");
        }
        if (pairMatchingDB.isSearch()) {
            System.out.println("Search");
        }
        if (pairMatchingDB.isInit()) {
            System.out.println("Init");
        }
    }


}
