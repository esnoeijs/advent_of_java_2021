package days;

public class Day2 implements Day {

    public int solve1(String[] args) {
        int pos = 0;
        int depth = 0;
        for (int i = 0; i < args.length; i++) {
            String[] instructions = args[i].split(" ");
            int val = Integer.parseInt(instructions[1]);

            switch (instructions[0]) {
                case "up" -> depth -= val;
                case "down" -> depth += val;
                case "forward" -> pos += val;
            }
        }
        return pos * depth;
    }

    public int solve2(String[] args) {
        int pos = 0;
        int depth = 0;
        int aim = 0;
        for (int i = 0; i < args.length; i++) {
            String[] instructions = args[i].split(" ");
            int val = Integer.parseInt(instructions[1]);

            switch (instructions[0]) {
                case "up":
                    aim -= val;
                    break;
                case "down":
                    aim += val;
                    break;
                case "forward":
                    pos += val;
                    depth += aim * val;
                    break;
            }
        }
        return pos * depth;
    }
}
