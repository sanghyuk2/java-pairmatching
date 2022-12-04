package pairmatching.view;

import pairmatching.util.ValidateMenuNumber;
import pairmatching.util.Validator;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static String readMenuNumber() {
        return validateInput("기능을 선택하세요.\n" +
                "1. 페어 매칭\n" +
                "2. 페어 조회\n" +
                "3. 페어 초기화\n" +
                "Q. 종료", new ValidateMenuNumber());
    }

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
