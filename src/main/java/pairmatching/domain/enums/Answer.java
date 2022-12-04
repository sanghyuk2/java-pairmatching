package pairmatching.domain.enums;

import java.util.Arrays;

public enum Answer {
    YES("네"),
    NO("아니오");

    private final String answer;

    Answer(String answer) {
        this.answer = answer;
    }

    public static Answer findAnswer(String input) {
        return Arrays.stream(Answer.values())
                .filter(answer -> answer.getAnswer().equals(input))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 네 아니오 중 선택하셔야 합니다."));
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isNo() {
        return this == NO;
    }
}
