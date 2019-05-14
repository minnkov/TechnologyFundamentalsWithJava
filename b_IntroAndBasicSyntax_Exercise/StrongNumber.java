package b_IntroAndBasicSyntax_Exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String numberString = String.valueOf(number);
        int digit = 0;
        char digitChar = '0';
        int factorialSum = 0;

        int digitCounter = numberString.length();

        for (int i = 0; i < digitCounter; i++) {
            digitChar = numberString.charAt(i);
            digit = Character.getNumericValue(digitChar);
            int digitFactorial = 1;
            for (int j = 1; j <= digit; j++) {
                digitFactorial *= j;
            }
            factorialSum += digitFactorial;
        }
        if (factorialSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
