package calculator.global.util;

import java.util.List;

public class DelimiterUtils {

    public static String extractionString(String text) {
        int customDelimiterIndex = 2;
        return String.valueOf(text.charAt(customDelimiterIndex));
    }

    public static List<Integer> mapToInteger(List<String> textList) {
        return textList.stream()
                .map(Integer::parseInt)
                .toList();
    }

}
