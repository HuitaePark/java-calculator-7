package calculator.ui;

import static calculator.global.constant.CalculatorMessage.CALCULATOR_RESULT_MESSAGE;
import static calculator.global.constant.CalculatorMessage.CALCULATOR_START_MESSAGE;

public class OutputView {

    public void printCalculatorStartMessage() {
        System.out.println(CALCULATOR_START_MESSAGE);
    }

    public void printCalculatorResultMessage(int result) {
        System.out.println(CALCULATOR_RESULT_MESSAGE + result);
    }

}
