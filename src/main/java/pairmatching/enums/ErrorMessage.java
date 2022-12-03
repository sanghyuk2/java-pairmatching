package pairmatching.enums;

public enum ErrorMessage {
    INVALID_OPTION("기능 번호 중 하나를 입력하셔야 합니다."),
    INVALID_COURSE("백엔드, 프론트엔드 중 하나를 입력하셔야 합니다."),
    INVALID_INPUT("잘못 입력하셨습니다.");

    private final String value;
    private static final String errorHead = "[ERROR] ";
    private static final String errorTail = " 다시 입력하세요.";

    ErrorMessage(String value) {
        this.value = errorHead + value + errorTail;
    }

    public String getValue() {
        return value;
    }
}
