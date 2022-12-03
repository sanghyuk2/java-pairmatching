package pairmatching.enums;

public enum ErrorMessage {
    INVALID_OPTION("기능 번호 중 하나를 입력하셔야 합니다.");

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
