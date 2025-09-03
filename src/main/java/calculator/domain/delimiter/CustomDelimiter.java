package calculator.domain.delimiter;

import java.util.List;

public class CustomDelimiter implements Delimiter {

    private final String delimiter;

    public CustomDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public List<String> separateString(String text) {
        text = splittingText(text);
        return List.of(text.split(delimiter));
    }

    private String splittingText(String text) {
        int beginIndex = 6;
        return text.substring(beginIndex);
    }
}
