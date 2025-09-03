package calculator.domain.delimiter;

import java.util.List;

public class CustomDelimiter implements Delimiter {

    private final String delimiter;

    public CustomDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public List<String> separateString(String text) {
        return List.of(text.split(delimiter));
    }

}
