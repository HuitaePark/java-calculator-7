package calculator;

import calculator.domain.Calculator;
import calculator.ui.InputHandler;
import calculator.ui.OutputView;

public class Application {
    public static void main(String[] args) {
        OutputView outputView = new OutputView();
        InputHandler inputHandler = new InputHandler();
        Calculator calculator = new Calculator(inputHandler, outputView);
        calculator.functioning();
    }
}
