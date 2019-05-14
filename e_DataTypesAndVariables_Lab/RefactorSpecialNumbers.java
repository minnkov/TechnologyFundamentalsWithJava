package e_DataTypesAndVariables_Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int currentNumber = i;
            int sum = 0;
            String isSpecial = "False";

            while (currentNumber > 0) {
                sum += currentNumber % 10;
                currentNumber = currentNumber / 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                isSpecial = "True";
            }
            System.out.printf("%d -> %s%n", i, isSpecial);
        }
    }
}
