package n_Methods_MoreExercise;

import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printTribonacciSequenceOfNumNumbers(num);
    }

    private static void printTribonacciSequenceOfNumNumbers(int num) {
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 2;
        int currentSum;

        for (int i = 0; i < num; i++) {
            if (i < 2) {
                System.out.print(firstNumber + " ");
            } else if (i == 2) {
                System.out.print(thirdNumber + " ");
            } else {
                currentSum = firstNumber + secondNumber + thirdNumber;
                firstNumber = secondNumber;
                secondNumber = thirdNumber;
                thirdNumber = currentSum;
                System.out.print(currentSum + " ");
            }
        }
    }
}
