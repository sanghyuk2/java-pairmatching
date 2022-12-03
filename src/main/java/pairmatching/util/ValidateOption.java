package pairmatching.util;

import pairmatching.enums.ErrorMessage;
import pairmatching.enums.Menu;

public class ValidateOption implements Validator{

    @Override
    public void validate(String input) {
        if (!Menu.matchOptionNumber(input)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_OPTION.getValue());
        }
    }
}
