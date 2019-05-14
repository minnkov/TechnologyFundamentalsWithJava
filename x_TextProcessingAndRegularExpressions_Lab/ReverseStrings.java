package x_TextProcessingAndRegularExpressions_Lab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            StringBuilder reversedInput = new StringBuilder(input);

            reversedInput = reversedInput.reverse();

            System.out.println(String.format("%s = %s", input, reversedInput.toString()));
        }
    }
}
