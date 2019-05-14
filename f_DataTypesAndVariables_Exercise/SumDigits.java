package f_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String numberString = String.valueOf(number);

        int numberLength = numberString.length();
        int sum = 0;

        for (int i = 0; i < numberLength; i++) {
            int currentDigit = Character.getNumericValue(numberString.charAt(i));
            sum += currentDigit;
        }
        System.out.println(sum);
    }
}
