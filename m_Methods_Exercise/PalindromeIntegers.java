package m_Methods_Exercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            String input = scanner.nextLine();

            if (input.equals("END")) {
                break;
            }

            printIsPalindrome(input);
        }
    }

    private static void printIsPalindrome(String input) {

        boolean isPalindrome = checkIfPalindrome(input);

        System.out.println(isPalindrome);
    }

    private static boolean checkIfPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
