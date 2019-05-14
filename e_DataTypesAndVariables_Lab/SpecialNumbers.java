package e_DataTypesAndVariables_Lab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String currentNumber = String.valueOf(i);
            int numberLength = currentNumber.length();
            int sum = 0;

            for (int j = 0; j < numberLength ; j++) {
                int currentDigit = Character.getNumericValue(currentNumber.charAt(j));
                sum +=currentDigit;
            }
            System.out.printf("%d -> ", i);
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
