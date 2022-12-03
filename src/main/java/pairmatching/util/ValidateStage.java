package pairmatching.util;

import pairmatching.enums.Course;
import pairmatching.enums.ErrorMessage;
import pairmatching.enums.Level;

public class ValidateStage implements Validator{
    private static final String STAGE_PATTERN = "[가-힣]*(, [가-힣]*[1-5])(, [가-힣]*)";

    @Override
    public void validate(String input) {
        isValidatePattern(input);

        String[] inputArr = input.split(", ");
        Course.findCourse(inputArr[0]);
        Level.findLevel(inputArr[1]);
    }

    private void isValidatePattern(String input) {
        if (!input.matches(STAGE_PATTERN)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getValue());
        }
    }
}
