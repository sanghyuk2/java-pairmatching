package pairmatching.enums;

public enum ViewMessage {
    INPUT_OPTION("기능을 선택하세요.\n" +
            Menu.MATCHING.getMenuNumber() + ". " + Menu.MATCHING.getMenuName() + "\n" +
            Menu.SEARCH.getMenuNumber() + ". " + Menu.SEARCH.getMenuName() + "\n" +
            Menu.INITIALIZE.getMenuNumber() + ". " + Menu.INITIALIZE.getMenuName() + "\n" +
            Menu.QUIT.getMenuNumber() + ". " + Menu.QUIT.getMenuName());

    private final String value;

    ViewMessage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
