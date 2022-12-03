package pairmatching.domain;

import pairmatching.enums.Menu;

public class PairMatchingDB {
    private String optionNumber = "";

    public void selectMenu(String option) {
        optionNumber = option;
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