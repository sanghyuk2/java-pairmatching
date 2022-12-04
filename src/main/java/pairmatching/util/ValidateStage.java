package pairmatching.util;

import pairmatching.domain.enums.Course;
import pairmatching.domain.enums.Level;

public class ValidateStage implements Validator {

    @Override
    public void validate(String input) {
        String[] splitInput = input.split(", ");
        Course.findCourse(splitInput[0]);
        Level.findLevel(splitInput[1]).isExistsMission(splitInput[2]);
    }
}
