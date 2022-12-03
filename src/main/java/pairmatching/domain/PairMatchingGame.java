package pairmatching.domain;

import pairmatching.enums.Menu;
import pairmatching.view.InputView;

public class PairMatchingGame {
    private final PairMatchingDB pairMatchingDB;
    private String optionNumber = "";

    public PairMatchingGame() {
        this.pairMatchingDB = new PairMatchingDB();
    }

    public void start() {
        while(true) {
            selectOption();
            if (isQuit()) {
                break;
            }
            doMatchGame();
        }
    }

    public void selectOption() {
        optionNumber = InputView.readOption();
    }

    private void doMatchGame() {
        if (isMatch()) {
            System.out.println("Match");
        }
        if (isSearch()) {
            System.out.println("Search");
        }
        if (isInit()) {
            System.out.println("Init");
        }
    }

    public boolean isMatch() {
        return Menu.findMenu(optionNumber).isMatching();
    }

    public boolean isSearch() {
        return Menu.findMenu(optionNumber).isSearch();
    }

    public boolean isInit() {
        return Menu.findMenu(optionNumber).isInit();
    }

    public boolean isQuit() {
        return Menu.findMenu(optionNumber).isQuit();
    }

}
