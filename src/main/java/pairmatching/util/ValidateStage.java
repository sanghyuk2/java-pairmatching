package pairmatching.util;

import pairmatching.enums.ErrorMessage;

public class ValidateStage implements Validator{
    private static final String STAGE_PATTERN = "[가-힣]*(, [가-힣]*[1-5])(, [가-힣]*)";

    @Override
    public void validate(String input) {
        isValidatePattern(input);
    }

    private void isValidatePattern(String input) {
        if (!input.matches(STAGE_PATTERN)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getValue());
        }
    }
}
