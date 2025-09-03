package calculator.domain.delimiter;

import java.util.List;

public class NormalDelimiter implements Delimiter {

    public static final String COMMA = ",";
    public static final String COLON = ":";

    @Override
    public List<String> separateString(String text) {
        return List.of(text.split(COMMA + "|" + COLON));
    }
}
