package calculator.domain;

import static calculator.global.constant.ErrorMessage.NOT_DEFAULT_DELIMITER;
import static calculator.global.constant.ErrorMessage.NOT_LENGTH_DELIMITER;
import static calculator.global.constant.ErrorMessage.NOT_NUMERIC_DELIMITER;

public class Delimiter {
    private final String normalDelimiter = "[:,]";
    private String customDelimiter = "";

    public Delimiter(String inputValue) {
        setCustomDelimiter(inputValue);
    }

    public String[] splitByDelimiter(String inputValue) {
        if (customDelimiter.isEmpty()) {
            return inputValue.split(normalDelimiter);
        }
        String targetValue = inputValue.substring(5);
        return targetValue.split(customDelimiter);
    }

    private void setCustomDelimiter(String inputValue) {
        if (hasCustomDelimiter(inputValue)) {
            String customDelimiter = getCustomDelimiter(inputValue);
            validate(customDelimiter);
            this.customDelimiter = escapeDelimiter(customDelimiter);
        }
    }

    private Boolean hasCustomDelimiter(String input) {
        return input.startsWith("//") && input.indexOf("\\n") >= 2;
    }

    private String escapeDelimiter(String customDelimiter) {
        if (".[]{}()*+=?^$|".contains(customDelimiter)) {
            return "\\" + customDelimiter;
        }
        return customDelimiter;
    }

    private String getCustomDelimiter(String inputValue) {
        return inputValue.substring(2, inputValue.indexOf("\\n"));
    }

    private void validate(String customDelimiter) {
        validateLength(customDelimiter);
        validateNumber(customDelimiter);
        validateNormalDelimiter(customDelimiter);
    }

    private void validateNormalDelimiter(String customDelimiter) {
        if (":,".contains(customDelimiter)) {
            throw new IllegalArgumentException(NOT_DEFAULT_DELIMITER);
        }
    }

    private void validateNumber(String customDelimiter) {
        if (customDelimiter.matches("\\d")) {
            throw new IllegalArgumentException(NOT_NUMERIC_DELIMITER);
        }
    }

    private void validateLength(String customDelimiter) {
        if (customDelimiter.length() != 1) {
            throw new IllegalArgumentException(NOT_LENGTH_DELIMITER);
        }
    }
}
