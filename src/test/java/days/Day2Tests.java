package days;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Day2Tests {

    @ParameterizedTest(name = "{1}")
    @CsvSource(value = {
            "forward 5;down 5;forward 8;up 3;down 8;forward 2, 150"
    })
    void solve1(String input, int expectedResult) {

        Day2 day = new Day2();
        assertEquals(expectedResult, day.solve1(input.split(";")),
                () -> input + " = " + expectedResult);
    }

    @ParameterizedTest(name = "{1}")
    @CsvSource(value = {
        "forward 5;down 5;forward 8;up 3;down 8;forward 2, 900"
})
    void solve2(String numbers, int expectedResult) {

        Day2 day = new Day2();
        assertEquals(expectedResult, day.solve2(numbers.split(";")),
                () -> numbers + " = " + expectedResult);
    }
}
