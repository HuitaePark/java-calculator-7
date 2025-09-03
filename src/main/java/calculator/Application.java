package calculator;

import calculator.domain.Calculator;
import calculator.ui.InputView;
import calculator.ui.OutputView;

public class Application {
    public static void main(String[] args) {
        OutputView outputView = new OutputView();
        InputView inputView = new InputView();
        Calculator calculator = new Calculator(inputView, outputView);
        calculator.functioning();
    }
}
