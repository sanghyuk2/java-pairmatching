package pairmatching.enums;

import java.util.Arrays;
import java.util.List;

public enum Level {
    LEVEL1("레벨1", Arrays.asList("자동차경주", "로또", "숫자야구게임")),
    LEVEL2("레벨2", Arrays.asList("장바구니","결제","지하철노선도")),
    LEVEL3("레벨3", Arrays.asList("")),
    LEVEL4("레벨4", Arrays.asList("성능개선","배포")),
    LEVEL5("레벨5", Arrays.asList(""));

    private final String name;
    private final List<String> missions;

    Level(String name, List<String> missions) {
        this.name = name;
        this.missions = missions;
    }

    // 추가 기능 구현
    public static Level findLevel(String level) {
        return Arrays.stream(Level.values())
                .filter(l -> l.isMatch(level))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(ErrorMessage.INVALID_LEVEL.getValue()));
    }

    private boolean isMatch(String level) {
        return this.getName().equals(level);
    }

    public void isExistMission(String mission) {
        this.getMissions().stream()
                .filter(m -> m.equals(mission))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(ErrorMessage.INVALID_MISSION.getValue()));
    }

    public String getName() {
        return name;
    }

    public List<String> getMissions() {
        return missions;
    }
}
