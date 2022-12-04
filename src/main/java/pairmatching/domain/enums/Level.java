package pairmatching.domain.enums;

import java.util.Arrays;
import java.util.List;

public enum Level {
    LEVEL1("레벨1", Arrays.asList("자동차경주", "로또", "숫자야구게임")),
    LEVEL2("레벨2", Arrays.asList("장바구니", "결제", "지하철노선도")),
    LEVEL3("레벨3", Arrays.asList("")),
    LEVEL4("레벨4", Arrays.asList("성능개선", "배포")),
    LEVEL5("레벨5", Arrays.asList(""));

    private final String level;
    private final List<String> mission;

    Level(String level, List<String> mission) {
        this.level = level;
        this.mission = mission;
    }

    // 추가 기능 구현
    public static Level findLevel(String input) {
        return Arrays.stream(Level.values())
                .filter(l -> l.getLevel().equals(input))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 찾으시는 레벨이 존재하지 않습니다."));
    }

    public void isExistsMission(String input) {
        this.getMission().stream()
                .filter(m -> m.equals(input))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 찾으시는 미션이 존재하지 않습니다."));
    }

    public String getLevel() {
        return level;
    }

    public List<String> getMission() {
        return mission;
    }
}
