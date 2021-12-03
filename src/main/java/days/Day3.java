package days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day3 implements Day {

    public int solve1(String[] args) {
        var len = args[0].length();
        int[] tally = Arrays.stream(args)
                .map(seq -> Stream.of(seq.split("")).mapToInt(Integer::parseInt).toArray())
                .reduce(new int[len], (result, cur) -> {
                    for (int idx = 0; idx < cur.length; idx++) {
                        switch (cur[idx]) {
                            case 1 -> result[idx]++;
                            case 0 -> result[idx]--;
                        }
                    }
                    return result;
                });

        var mostCommon = Integer.parseInt(Arrays.stream(tally)
                .mapToObj(bit -> bit > 0 ? "1" : "0")
                .collect(Collectors.joining("")), 2);
        var leastCommon = Integer.parseInt(Arrays.stream(tally)
                .mapToObj(bit -> bit > 0 ? "0" : "1")
                .collect(Collectors.joining("")), 2);

        return mostCommon * leastCommon;
    }

    public int solve2(String[] args) {
        var set = Arrays.stream(args)
                .map(seq -> Stream.of(seq.split("")).mapToInt(Integer::parseInt).toArray())
                .toArray(int[][]::new);

        var oxyRatingSet = this.filterSequence(args[0].length(), set.clone(), true);
        var oxyRating = Arrays.stream(oxyRatingSet[0])
                .mapToObj(bit -> bit > 0 ? "1" : "0")
                .collect(Collectors.joining(""));

        var co2RatingSet = this.filterSequence(args[0].length(), set.clone(), false);
        var co2Rating = Arrays.stream(co2RatingSet[0])
                .mapToObj(bit -> bit > 0 ? "1" : "0")
                .collect(Collectors.joining(""));

        return Integer.parseInt(oxyRating, 2) * Integer.parseInt(co2Rating, 2);
    }

    private int[][] filterSequence(int cols, int[][] oxyRatingSet, Boolean mostCommon) {
        for (int i = 0; i < cols; i++) {
            oxyRatingSet = this.filterSequencesOnColumn(oxyRatingSet, i, mostCommon);
            if (oxyRatingSet.length == 1) {
                break;
            }
        }
        return oxyRatingSet;
    }

    private int[][] filterSequencesOnColumn(int[][] sequences, int col, Boolean mostCommon) {
        var match1 = new ArrayList<int[]>();
        var match0 = new ArrayList<int[]>();
        for (int i = 0; i < sequences.length; i++) {
            if (sequences[i][col] > 0) {
                match1.add(sequences[i]);
            } else {
                match0.add(sequences[i]);
            }
        }

        if (match1.size() >= match0.size()) {
            return mostCommon ? match1.toArray(int[][]::new) : match0.toArray(int[][]::new);
        } else {
            return mostCommon ? match0.toArray(int[][]::new) : match1.toArray(int[][]::new);
        }
    }
}
