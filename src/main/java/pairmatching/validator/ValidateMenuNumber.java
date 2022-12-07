package pairmatching.validator;

import pairmatching.domain.enums.Menu;

public class ValidateMenuNumber implements Validator {

    @Override
    public void validate(String input) {
        Menu.findMenu(input);
    }
}
