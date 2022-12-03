package pairmatching.view;

import pairmatching.enums.ViewMessage;
import pairmatching.util.Validator;

public class InputView {

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
