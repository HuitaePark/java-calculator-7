package calculator.ui;


import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private final OutputView outputView;

    public InputView(OutputView outputView) {
        this.outputView = outputView;
    }


    private String readLine() {
        return Console.readLine();
    }

}
