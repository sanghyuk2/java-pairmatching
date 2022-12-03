package pairmatching.view;

import pairmatching.enums.ViewMessage;

public class InputView {

    private static void printMessage(String message) {
        System.out.println(message);
    }

    private static void printMessage(ViewMessage... inputStartGame) {
        for (ViewMessage viewMessage : inputStartGame) {
            printMessage(viewMessage.getValue());
        }
    }
}
