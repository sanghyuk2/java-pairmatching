package pairmatching.view;

import pairmatching.enums.ViewMessage;
import pairmatching.util.ValidateOption;
import pairmatching.util.Validator;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    private static final ValidateOption validateOption = new ValidateOption();

    public static String readOption() {
        printMessage(ViewMessage.INPUT_OPTION);
        String option = "";
        while (option.length() == 0) {
            option = getValid(readLine(), validateOption);
        }
        return option;
    }

    private static String getValid(String input, Validator validator) {
        try {
            validator.validate(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return "";
        }
        return input;
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

    private static void printMessage(ViewMessage... inputStartGame) {
        for (ViewMessage viewMessage : inputStartGame) {
            printMessage(viewMessage.getValue());
        }
    }
}
