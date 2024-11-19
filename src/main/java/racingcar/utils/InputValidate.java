package racingcar.utils;

import racingcar.Enums.ErrorMessage;

public class InputValidate {
    public static boolean isValidParam(String input) {
        String[] inputNames = input.split(",");
        for (int i = 0; i < inputNames.length; i++) {
            if (inputNames[i].length() > 5) {
                throw new IllegalArgumentException(ErrorMessage.INVALID_PARAM.getErrorMessage());
            }
        }
        return true;
    }

    public static boolean isValidLength(String[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i].length() > 5) {
                throw new IllegalArgumentException(ErrorMessage.INVALID_LENGTH.getErrorMessage());
            }
        }
        return true;
    }

    public static boolean isNameEqualZero(String[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("")) {
                throw new IllegalArgumentException(ErrorMessage.INVALID_NO_INPUT.getErrorMessage());
            }
        }
        return true;
    }

    public static boolean isNameContainsSpace(String[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i].contains(" ")) {
                throw new IllegalArgumentException(ErrorMessage.INVALID_SPACING.getErrorMessage());
            }
        }
        return true;
    }

    public static boolean isNumberZero(int number) {
        if (number == 0) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NUMBER_ZERO.getErrorMessage());
        }
        return true;
    }

}
