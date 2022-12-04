package pairmatching.domain;

import pairmatching.domain.enums.Course;
import pairmatching.domain.enums.Level;

import java.util.Objects;

public class Stage {
    Course course;
    Level level;
    String mission;

    public Stage(Course course, Level level, String mission) {
        this.course = course;
        this.level = level;
        this.mission = mission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stage stage = (Stage) o;
        return course == stage.course && level == stage.level && Objects.equals(mission, stage.mission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, level, mission);
    }

    public Level getLevel() {
        return level;
    }

    public String getMission() {
        return mission;
    }

    public Course getCourse() {
        return course;
    }
}
