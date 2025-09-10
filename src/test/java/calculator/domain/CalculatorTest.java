package calculator.domain;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {
    @DisplayName("계산 성공 통합테스트")
    @ParameterizedTest
    @ValueSource(strings = {"1,2,3", "//;\\n1;2;3"})
    public void calc_sum_test(String input) {
        Calculator calc = new Calculator(input);

        assertThat(calc.combineElement()).isEqualTo(6);
    }
}
