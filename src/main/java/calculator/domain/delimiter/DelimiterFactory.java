package calculator.domain.delimiter;


import static calculator.global.util.DelimiterUtils.extractionString;
import static calculator.global.util.Validator.hasCustomDelimiter;

public class DelimiterFactory {
    Delimiter create(String text) {
        if (hasCustomDelimiter(text)) {
            return new CustomDelimiter(extractionString(text));
        }
        return new NormalDelimiter();
    }
}
