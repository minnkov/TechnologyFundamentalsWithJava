package k_Arrays_MoreExercise;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        checkIfProductIsPositiveOrNegative(num1, num2, num3);
    }

    private static void checkIfProductIsPositiveOrNegative(int num1, int num2, int num3) {
        int negativeCounter = 0;

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("zero");
            return;
        }
        if (num1 < 0) {
            negativeCounter++;
        }
        if (num2 < 0) {
            negativeCounter++;
        }
        if (num3 < 0) {
            negativeCounter++;
        }
        if (negativeCounter % 2 == 0) {
            System.out.println("positive");
        } else{
            System.out.println("negative");
        }
    }
}
