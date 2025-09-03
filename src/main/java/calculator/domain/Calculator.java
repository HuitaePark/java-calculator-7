package calculator.domain;

import static calculator.global.util.DelimiterUtils.mapToInteger;

import calculator.domain.delimiter.Delimiter;
import calculator.domain.delimiter.DelimiterFactory;
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
        String text = inputView.inputText();

        Delimiter delimiter = DelimiterFactory.create(text);
        List<String> separatedText = delimiter.separateString(text);
        List<Integer> numberList = mapToInteger(separatedText);
        int sum = combineElement(numberList);
        outputView.printCalculatorResultMessage(sum);
    }


    private void printStartMessage() {
        outputView.printCalculatorStartMessage();
    }

    private int combineElement(List<Integer> numList) {
        return numList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
