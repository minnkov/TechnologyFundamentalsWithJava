package k_Arrays_MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStrings = Integer.parseInt(scanner.nextLine());
        String[] endResult = new String[numberOfStrings];


        for (int i = 0; i < numberOfStrings; i++) {
            String input = scanner.nextLine();
            int inputSum = 0;

            for (int j = 0; j < input.length(); j++) {
                int charValue = input.charAt(j);
                if (input.charAt(j) == 'a' || input.charAt(j) == 'e' || input.charAt(j) == 'i' ||
                        input.charAt(j) == 'o' || input.charAt(j) == 'u') {
                    inputSum += charValue * input.length();

                } else {
                    inputSum += charValue / input.length();
                }
            }
            String sumString = Integer.toString(inputSum);

            endResult[i] = sumString;
        }

        int[] numericEndResult = Arrays.stream(endResult).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(numericEndResult);

        for (int number : numericEndResult) {
            System.out.println(number);
        }
    }
}
