package l_Methods_lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (operation) {
            case "add":
                add(firstNumber, secondNumber);
                break;
            case "multiply":
                multiplication(firstNumber, secondNumber);
                break;
            case "divide":
                division(firstNumber, secondNumber);
                break;
            case "subtract":
                substraction(firstNumber, secondNumber);
                break;
        }
    }

    private static void division(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }

    private static void substraction(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    private static void multiplication(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }

    private static void add(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }
}
