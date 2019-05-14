package x_TextProcessingAndRegularExpressions_Lab;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder otherChars = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char currentSymbol = input.charAt(i);

            if (Character.isDigit(currentSymbol)) {
                digits.append(currentSymbol);
            } else if (Character.isAlphabetic(currentSymbol)) {
                letters.append(currentSymbol);
            } else {
                otherChars.append(currentSymbol);
            }
        }

        if (digits.length() > 0) {
            System.out.println(digits.toString());
        }

        if (letters.length() > 0) {
            System.out.println(letters.toString());
        }

        if (otherChars.length() > 0) {
            System.out.println(otherChars.toString());
        }
    }
}
