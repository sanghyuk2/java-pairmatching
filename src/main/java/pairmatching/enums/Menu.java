package pairmatching.enums;

import java.util.Arrays;

public enum Menu {
    MATCHING("1", "페어 매칭"),
    SEARCH("2", "페어 조회"),
    INITIALIZE("3", "페어 초기화"),
    QUIT("Q", "종료");

    private final String menuNumber;
    private final String menuName;

    Menu(String menuNumber, String menuName) {
        this.menuNumber = menuNumber;
        this.menuName = menuName;
    }

    public String getMenuNumber() {
        return menuNumber;
    }

    public String getMenuName() {
        return menuName;
    }

    public static boolean matchOptionNumber(String input) {
        return Arrays.stream(Menu.values())
                .anyMatch(option -> option.getMenuNumber().equals(input));
    }

    public static Menu findMenu(String input) {
        return Arrays.stream(Menu.values())
                .filter(menu -> menu.isMatch(input))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(ErrorMessage.INVALID_OPTION.getValue()));
    }

    private boolean isMatch(String input) {
        return this.getMenuNumber().equals(input);
    }

    public boolean isMatching() {
        return this == MATCHING;
    }

    public boolean isSearch() {
        return this == SEARCH;
    }

    public boolean isInit() {
        return this == INITIALIZE;
    }

    public boolean isQuit() {
        return this == QUIT;
    }
}
