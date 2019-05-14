package m_Methods_Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        printfactorialDivision(firstNumber, secondNumber);

    }
    public static void printfactorialDivision(int firstNumber, int secondNumber) {

        double firstNumberFact = getFactorial(firstNumber);
        double secondNumberFact = getFactorial(secondNumber);

        System.out.printf("%.2f", (firstNumberFact / secondNumberFact));

    }
    public static double getFactorial(int number) {
        double factorialSum = number;

        for (int i = number - 1; i >= 1 ; i--) {
            factorialSum *= i;
        }

        return factorialSum;
    }
}
