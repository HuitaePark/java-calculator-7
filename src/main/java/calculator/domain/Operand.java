package calculator.domain;

import static calculator.global.constant.ErrorMessage.NOT_STRING_MESSAGE;
import static calculator.global.constant.ErrorMessage.NUMBER_NEGATIVE_ERROR_MESSAGE;

public class Operand {

    private final int operand;

    public Operand(String element) {
        int operand = parseToInt(element);
        validatePositiveNumber(operand);
        this.operand = operand;
    }

    public int getOperand() {
        return operand;
    }

    private int parseToInt(String element) {
        try {
            return Integer.parseInt(element);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NOT_STRING_MESSAGE);
        }

    }

    private void validatePositiveNumber(int operand) {
        if (operand <= 0) {
            throw new IllegalArgumentException(NUMBER_NEGATIVE_ERROR_MESSAGE);
        }
    }
}
