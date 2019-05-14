package l_Methods_lab;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        if (number < 0) {
            number = Math.abs(number);
        }

        int productOfEvensAndOdds = getProductOfEvensAndOdds(number);
        System.out.println(productOfEvensAndOdds);

    }

    private static int getProductOfEvensAndOdds(int number) {
        int evensSum = getSumOfEvenDigits(number);
        int oddsSum = getSumOfOddDigits(number);

        return evensSum * oddsSum;
    }

    private static int getSumOfEvenDigits(int number) {

        int[] inputNumeric = Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;

        for (int i = 0; i < inputNumeric.length; i++) {
            if (inputNumeric[i] % 2 == 0) {
                evenSum += Math.abs(inputNumeric[i]);
            }
        }

        return evenSum;
    }

    private static int getSumOfOddDigits(int number) {

        int[] inputNumeric = Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();

        int oddSum = 0;

        for (int i = 0; i < inputNumeric.length; i++) {
            if (inputNumeric[i] % 2 != 0) {
                oddSum += Math.abs(inputNumeric[i]);
            }
        }

        return oddSum;
    }
}
