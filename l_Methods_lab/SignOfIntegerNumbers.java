package l_Methods_lab;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    static void printSign(int number) {
        if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else {
            System.out.print("The number 0 is zero.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        printSign(number);
    }
}
