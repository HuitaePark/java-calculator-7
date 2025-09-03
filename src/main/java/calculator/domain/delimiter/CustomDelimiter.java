package calculator.domain.delimiter;

import java.util.List;

public class CustomDelimiter implements Delimiter {

    private final String delimiter;

    public CustomDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public List<String> separateString(String text) {
        String splitting = splittingText(text);
        return List.of(splitting.split(delimiter));
    }

    private String splittingText(String text) {
        int newLineIndex = text.indexOf("n") + 1;
        return text.substring(newLineIndex);
    }
}
