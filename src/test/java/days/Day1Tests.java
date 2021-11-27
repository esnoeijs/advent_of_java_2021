package days;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Day1Tests {

    @ParameterizedTest(name = "{1}")
    @CsvSource(value = {
            "0;2;1;3, 2",
            "199;200;208;210;200;207;240;269;260;263, 7"
    })
    void solve1(String numbers, int expectedResult) {

        Day1 day = new Day1();
        assertEquals(expectedResult, day.solve1(numbers.split(";")),
                () -> numbers + " = " + expectedResult);
    }

    @ParameterizedTest(name = "{1}")
    @CsvSource(value = {
            "199;200;208;210;200;207;240;269;260;263, 5"
    })
    void solve2(String numbers, int expectedResult) {

        Day1 day = new Day1();
        assertEquals(expectedResult, day.solve2(numbers.split(";")),
                () -> numbers + " = " + expectedResult);
    }
}
