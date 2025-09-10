package calculator.controller;

import calculator.domain.Calculator;
import calculator.ui.InputHandler;
import calculator.ui.OutputView;
import java.util.List;

public class CalculatorController {

    public void execute() {

        InputHandler inputHandler = new InputHandler();
        OutputView outputView = new OutputView();

        outputView.printCalculatorStartMessage();
        String text = inputHandler.inputText();

        Calculator calculator = new Calculator(text);
        int sum = calculator.combineElement();
        outputView.printCalculatorResultMessage(sum);
    }

    private List<Integer> mapToInteger(List<String> textList) {
        return textList.stream()
                .map(Integer::parseInt)
                .toList();
    }

}
