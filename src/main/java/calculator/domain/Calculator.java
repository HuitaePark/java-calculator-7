package calculator.domain;

import calculator.ui.InputView;
import calculator.ui.OutputView;

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
        //구분자에 보내서 변환
        //계산기에서 더함
        //아웃풋 뷰에서 출력
    }

    public void printStartMessage() {
        outputView.printCalculatorStartMessage();
    }

}
