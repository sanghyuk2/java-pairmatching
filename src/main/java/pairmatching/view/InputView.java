package pairmatching.view;

import pairmatching.util.Validator;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    private static String validateInput(String message, Validator validate) {
        System.out.println(message);
        while (true) {
            try {
                String input = readLine();
                validate.validate(input);
                return input;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
