package pairmatching.view;

import pairmatching.util.ValidateMenuNumber;
import pairmatching.util.ValidateStage;
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

    public static String readStage() {
        return validateInput("과정, 레벨, 미션을 선택하세요.\n" +
                "ex) 백엔드, 레벨1, 자동차경주", new ValidateStage());
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
