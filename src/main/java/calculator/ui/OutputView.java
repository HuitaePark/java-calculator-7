package calculator.ui;

import static calculator.global.constant.CalculatorMessage.CALCULATOR_START_MESSAGE;

public class OutputView {

    public void printCalculatorStartMessage(){
        println(CALCULATOR_START_MESSAGE);
    }

    private void println(String text){
        System.out.println(text);
    }
}
