package pairmatching.domain;

public class PairMatchingGame {
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
