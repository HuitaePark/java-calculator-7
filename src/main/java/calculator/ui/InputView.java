package calculator.ui;


import calculator.domain.delimiter.Delimiter;
import camp.nextstep.edu.missionutils.Console;
import java.util.List;

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

}
