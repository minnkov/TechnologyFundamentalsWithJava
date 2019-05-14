package l_Methods_lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repeatCounter = Integer.parseInt(scanner.nextLine());

        String result = outputString(input, repeatCounter);
        System.out.println(result);
    }

    private static String outputString(String input, int repeatCounter) {
        String result = "";

        for (int i = 0; i < repeatCounter; i++) {
            result += input;
        }

        return result;
    }
}
