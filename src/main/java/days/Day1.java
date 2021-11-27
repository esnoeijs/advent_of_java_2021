package days;

import java.util.Arrays;

public class Day1 {

    public int solve1(String[] args) {
        int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();

        int count = 0;
        for (int i = 1; i < args.length; i++) {
            if (numbers[i - 1] < numbers[i]) {
                count++;
            }
        }

        return count;
    }

    public int solve2(String[] args) {
        int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();

        int count = 0;
        for (int i = 0; i < args.length - 3; i++) {
            if (numbers[i + 0] + numbers[i + 1] + numbers[i + 2] < numbers[i + 1] + numbers[i + 2] + numbers[i + 3]) {
                count++;
            }
        }

        return count;
    }
}
