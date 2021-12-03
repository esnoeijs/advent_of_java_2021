import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import days.Day;
import days.Day1;
import days.Day2;
import days.Day3;

public class Main {
    public static void main(String[] args) {
        switch (args[0]) {
            case "day1" -> Main.runDay(new Day1(), "inputs/day1");
            case "day2" -> Main.runDay(new Day2(), "inputs/day2");
            case "day3" -> Main.runDay(new Day3(), "inputs/day3");
            default -> System.out.println("Unknown day");
        }
    }

    public static void runDay(Day day, String filepath) {
        ArrayList<String> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            while (br.ready()) {
                result.add(br.readLine());
            }
            System.out.println(day.solve1(result.toArray(new String[0])));
            System.out.println(day.solve2(result.toArray(new String[0])));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}