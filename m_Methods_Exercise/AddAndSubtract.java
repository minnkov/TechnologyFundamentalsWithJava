package m_Methods_Exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        subtract(firstNumber, secondNumber, thirdNumber);
    }

    public static void subtract(int firstNumber, int secondNumber, int thirdNumber) {
        System.out.println(getSum(firstNumber, secondNumber) - thirdNumber);
    }

    private static int getSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
