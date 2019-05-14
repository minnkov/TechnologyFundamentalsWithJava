package x_TextProcessingAndRegularExpressions_Lab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length; i++) {

            String word = input[i];

            for (int j = 0; j < word.length(); j++) {

                output.append(word);
            }
        }

        System.out.println(output.toString());
    }
}
