package calculator.controller;

import calculator.domain.Calculator;
import calculator.domain.delimiter.DelimiterFactory;
import calculator.ui.InputHandler;
import calculator.ui.OutputView;
import java.util.List;

public class CalculatorController {

    private final InputHandler inputHandler;
    private final OutputView outputView;
    private final Calculator calculator;

    public CalculatorController(Calculator calculator, InputHandler inputHandler, OutputView outputView) {
        this.calculator = calculator;
        this.inputHandler = inputHandler;
        this.outputView = outputView;
    }

    public void execute() {
        outputView.printCalculatorStartMessage();
        String text = inputHandler.inputText();
        List<String> separatedText = DelimiterFactory.create(text).separateString(text);
        List<Integer> numberList = mapToInteger(separatedText);
        int sum = calculator.combineElement(numberList);
        outputView.printCalculatorResultMessage(sum);
    }

    private List<Integer> mapToInteger(List<String> textList) {
        return textList.stream()
                .map(Integer::parseInt)
                .toList();
    }

}
