package calculator.global.util;


public class DelimiterUtils {

    public static String extractionString(String text) {
        int customDelimiterIndex = 2;
        return String.valueOf(text.charAt(customDelimiterIndex));
    }
}
