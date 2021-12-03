package days;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Day3Tests {

    @ParameterizedTest(name = "{1}")
    @CsvSource(value = {
            "00100;11110;10110;10111;10101;01111;00111;11100;10000;11001;00010;01010, 198"
    })
    void solve1(String input, int expectedResult) {

        var day = new Day3();
        assertEquals(expectedResult, day.solve1(input.split(";")),
                () -> input + " = " + expectedResult);
    }

    @ParameterizedTest(name = "{1}")
    @CsvSource(value = {
            "00100;11110;10110;10111;10101;01111;00111;11100;10000;11001;00010;01010, 230"
    })
    void solve2(String numbers, int expectedResult) {

        var day = new Day3();
        assertEquals(expectedResult, day.solve2(numbers.split(";")),
                () -> numbers + " = " + expectedResult);
    }
}
