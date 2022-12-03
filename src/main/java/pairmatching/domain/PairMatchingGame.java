package pairmatching.domain;

import pairmatching.view.InputView;

public class PairMatchingGame {
    private final PairMatchingDB pairMatchingDB;

    public PairMatchingGame() {
        this.pairMatchingDB = new PairMatchingDB();
    }

    public void start() {
        selectOption();
    }

    public void selectOption() {
        pairMatchingDB.selectMenu(InputView.readOption());
    }
}
