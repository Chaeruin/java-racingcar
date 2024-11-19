package racingcar.utils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import racingcar.Enums.ErrorMessage;

public class InputParser {
    public static List<String> nameParser(String input) {
        List<String> name = new LinkedList<>();
        try {
            String[] inputNames = input.split(",");
            if (InputValidate.isValidParam(input) && InputValidate.isValidLength(inputNames) && InputValidate.isNameEqualZero(inputNames) && InputValidate.isNameContainsSpace(inputNames)) {
                name.addAll(Arrays.asList(inputNames));
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        return name;
    }

    public static int numberParser(String number) {
        int parseNumber;
        try {
            parseNumber = Integer.parseInt(number);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NO_INPUT.getErrorMessage());
        }
        return parseNumber;
    }
}
