import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import days.Day1;

public class Main {
    public static void main(String[] args) {
        String filepath = "inputs/day1";

        ArrayList<String> result = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            while (br.ready()) {
                result.add(br.readLine());
            }
            System.out.println(Arrays.toString(result.toArray()));

            Day1 day = new Day1();
            System.out.println(day.solve1(result.toArray(new String[0])));
            System.out.println(day.solve2(result.toArray(new String[0])));

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}