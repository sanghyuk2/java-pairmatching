package pairmatching.domain;

import pairmatching.enums.Course;
import pairmatching.enums.Level;

import java.util.Objects;

public class Crew {
    private final Course course;
    private final Level level;
    private final Level mission;

    public Crew(Course course, Level level, Level mission) {
        this.course = course;
        this.level = level;
        this.mission = mission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crew crew = (Crew) o;
        return course == crew.course && level == crew.level && mission == crew.mission;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, level, mission);
    }
}
