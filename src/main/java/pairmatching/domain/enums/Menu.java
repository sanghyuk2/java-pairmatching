package pairmatching.domain.enums;

import java.util.Arrays;

public enum Menu {

    MATCHING("1"),
    SEARCH("2"),
    INITIALIZE("3"),
    QUIT("Q");

    private final String menuNumber;

    Menu(String menuNumber) {
        this.menuNumber = menuNumber;
    }

    public static Menu findMenu(String input) {
        return Arrays.stream(Menu.values())
                .filter(menu -> menu.getMenuNumber().equals(input))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 찾으시는 메뉴가 존재하지 않습니다."));
    }

    public String getMenuNumber() {
        return menuNumber;
    }

    public boolean isQuit() {
        return this == QUIT;
    }
}
