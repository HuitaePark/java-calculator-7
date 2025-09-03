package calculator.ui;


import calculator.domain.delimiter.Delimiter;
import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {
    private final OutputView outputView;
    private final Delimiter delimiter;

    public InputView(OutputView outputView, Delimiter delimiter) {
        this.outputView = outputView;
        this.delimiter = delimiter;
    }

    public List<String> inputText() {
        String text = Console.readLine();
        return delimiter.separateString(text);
    }

    public boolean hasCustomDelimiter(String input) {
        return input.matches(".*//.+\\n.*");
    }

    public String extractionString(String text) {
        Pattern pattern = Pattern.compile("//(.)\n");
        Matcher matcher = pattern.matcher(text);
        return matcher.group(1);
    }

}
