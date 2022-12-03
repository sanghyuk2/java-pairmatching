package pairmatching.enums;

import java.util.Arrays;

public enum Course {
    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private String name;

    Course(String name) {
        this.name = name;
    }

    public static Course findCourse(String course) {
        return Arrays.stream(Course.values())
                .filter(c -> c.isMatch(course))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(ErrorMessage.INVALID_COURSE.getValue()));
    }

    private boolean isMatch(String course) {
        return this.name.equals(course);
    }

    // 추가 기능 구현
}
