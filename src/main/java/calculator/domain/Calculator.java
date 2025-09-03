package calculator.domain;

import calculator.ui.InputView;
import calculator.ui.OutputView;
import java.util.List;

public class Calculator {
    private final InputView inputView;
    private final OutputView outputView;

    public Calculator(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void functioning() {
        printStartMessage();
        List<String> delimitedString = inputView.inputText();

    }


    public void printStartMessage() {
        outputView.printCalculatorStartMessage();
    }


}
