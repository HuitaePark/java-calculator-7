package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class OperandTest {

    @DisplayName("피연산자 변환 성공 테스트")
    @Test
    public void separated_test() {
        String[] operandArray = {"1", "2", "3"};
        Operands operands = new Operands(operandArray);

        List<Operand> operandList = new ArrayList<>();
        for (String input : operandArray) {
            operandList.add(new Operand(input));
        }

        assertThat(operands.getOperands())
                .usingElementComparator(Comparator.comparing(Operand::getOperand))
                .containsExactlyInAnyOrderElementsOf(operandList);
    }

    @DisplayName("음수인 피연산자 실패 테스트")
    @Test
    public void negative_operand_test() {
        assertThatThrownBy(() -> {
            Operand operand = new Operand("-1");
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("양수만 입력해야 합니다.");
    }

    @DisplayName("문자인 피연산자 실패 테스트")
    @Test
    public void string_operand_test() {
        assertThatThrownBy(() -> {
            Operand operand = new Operand("?");
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("정수자리에 문자가 들어가면 안됩니다.");
    }


}
