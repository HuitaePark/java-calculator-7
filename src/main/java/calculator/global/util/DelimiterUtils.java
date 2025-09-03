package calculator.global.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DelimiterUtils {

    public static String extractionString(String text) {
        Pattern pattern = Pattern.compile("//(.)\n");
        Matcher matcher = pattern.matcher(text);
        return matcher.group(1);
    }
}
