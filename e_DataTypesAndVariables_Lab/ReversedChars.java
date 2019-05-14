package e_DataTypesAndVariables_Lab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char char1 = scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);
        char char3 = scanner.nextLine().charAt(0);

        String reversedCharSum = String.format("%c %c %c", char3, char2, char1);

        System.out.println(reversedCharSum);

    }
}
