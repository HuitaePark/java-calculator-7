package calculator.domain.delimiter;


import calculator.ui.InputView;

public class DelimiterFactory {

    private final InputView inputView;

    public DelimiterFactory(InputView inputView) {
        this.inputView = inputView;
    }

    Delimiter create(String text) {
        if (inputView.hasCustomDelimiter(text)) {
            return new CustomDelimiter(inputView.extractionString(text));
        }
        return new NormalDelimiter();
    }
}
