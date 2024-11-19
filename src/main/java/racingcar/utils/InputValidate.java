package racingcar.utils;

import racingcar.Enums.ErrorMessage;

public class InputValidate {
    public boolean isValidParam(String input) {
        String[] inputNames = input.split(",");
        for (int i = 0; i < inputNames.length; i++) {
            if (inputNames[i].length() > 5) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidLength(String[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i].length() > 5) { return false; }
        }
        return true;
    }

    public boolean isNameEqualZero(String[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("")) { return false; }
        }
        return true;
    }

    public boolean isNameContainsSpace(String[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i].contains(" ")) { return false; }
        }
        return true;
    }

    public boolean isNumberZero(int number) {
        return number != 0;
    }

}
