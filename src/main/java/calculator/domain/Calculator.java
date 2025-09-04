package calculator.domain;

import java.util.List;

public class Calculator {

    public int combineElement(List<Integer> numList) {
        return numList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

}
