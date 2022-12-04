package pairmatching.util;

import pairmatching.domain.enums.Answer;

public class ValidateAnswer implements Validator {

    @Override
    public void validate(String input) {
        Answer.findAnswer(input);
    }
}
