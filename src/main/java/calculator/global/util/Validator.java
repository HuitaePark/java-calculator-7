package calculator.global.util;

public class Validator {
    public static boolean hasCustomDelimiter(String input) {
        if (input == null) {
            return false;
        }
        return input.startsWith("//");
    }
}
