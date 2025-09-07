package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DelimiterTest {

    @DisplayName("구분자 분리 성공 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"//;\\n1;2;3"})
    public void separated_test(String input) {
        Delimiter delimiter = new Delimiter(input);
        String[] operandArray = {"1", "2", "3"};

        assertThat(operandArray).containsExactlyInAnyOrder(delimiter.splitByDelimiter(input));
    }

    @DisplayName("커스텀 구분자가 기본 구분자인 실패 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"//:\\n1:2:3"})
    public void normalDelimiter_test(String input) {
        assertThatThrownBy(() -> {
            Delimiter delimiter = new Delimiter(input);
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("커스텀구분자에 기본생성자가 포함되었습니다.");
    }

    @DisplayName("커스텀 구분자가 숫자인 실패 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"//1\\n11213"})
    public void customDelimiter_number_test(String input) {
        assertThatThrownBy(() -> {
            Delimiter delimiter = new Delimiter(input);
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("커스텀구분자는 숫자가 불가능합니다.");
    }

    @DisplayName("커스텀 구분자가 길이가 1이 아닌 실패 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"//::\\n1::2::3"})
    public void customDelimiter_length_test(String input) {
        assertThatThrownBy(() -> {
            Delimiter delimiter = new Delimiter(input);
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("커스텀구분자는 한글자만 가능합니다.");
    }
}
