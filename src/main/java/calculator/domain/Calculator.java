package calculator.domain;

public class Calculator {

    private final Operands operands;

    public Calculator(String inputValue) {
        Delimiter delimiter = new Delimiter(inputValue);
        this.operands = new Operands(delimiter.splitByDelimiter(inputValue));
    }

    public int combineElement() {
        return operands.getOperands().stream()
                .mapToInt(Operand::getOperand)
                .sum();
    }

}
