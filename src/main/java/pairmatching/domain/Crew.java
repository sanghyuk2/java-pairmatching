package pairmatching.domain;

import pairmatching.domain.enums.Course;

import java.util.Objects;

public class Crew {
    Course course;
    String name;

    public Crew(Course course, String name) {
        this.course = course;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crew crew = (Crew) o;
        return course == crew.course && Objects.equals(name, crew.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, name);
    }

    @Override
    public String toString() {
        return name;
    }
}
