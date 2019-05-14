package k_Arrays_MoreExercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double previousNumber = 1;
        double currentNumber = 1;
        double currentSum = 1;
        int numberCounter = 3;

        while (numberCounter <= n) {
            currentSum = currentNumber + previousNumber;
            previousNumber = currentNumber;
            currentNumber = currentSum;
            numberCounter++;

        }
        if (n > 0) {
            System.out.printf("%.0f", currentSum);
        }
    }
}
