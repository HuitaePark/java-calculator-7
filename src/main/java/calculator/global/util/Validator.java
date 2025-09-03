package calculator.global.util;

public class Validator {
    public static boolean hasCustomDelimiter(String input) {
        return input.matches(".*//.+\\n.*");
    }
}
