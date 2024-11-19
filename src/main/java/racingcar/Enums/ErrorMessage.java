package racingcar.Enums;

public enum ErrorMessage {
    INVALID_PARAM("[ERROR] 입력이 올바르지 않습니다."),
    INVALID_LENGTH("[ERROR] 이름이 5자 초과입니다."),
    INVALID_NO_INPUT("[ERROR] 입력이 없습니다."),
    INVALID_SPACING("[ERROR] 띄어쓰기는 포함될 수 없습니다."),
    INVALID_NUMBER_ZERO("[ERROR] 0 번은 입력할 수 없습니다.");


    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}
