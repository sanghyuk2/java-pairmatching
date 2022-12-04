package pairmatching.domain.enums;

import java.util.Arrays;

public enum Course {
    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private String name;

    Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Course findCourse(String input) {
        return Arrays.stream(Course.values())
                .filter(c -> c.getName().equals(input))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 찾으시는 과정이 존재하지 않습니다."));
    }
}
