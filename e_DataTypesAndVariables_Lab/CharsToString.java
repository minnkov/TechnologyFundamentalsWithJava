package e_DataTypesAndVariables_Lab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char char1 = scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);
        char char3 = scanner.nextLine().charAt(0);

        String charSum = String.format("%c%c%c", char1, char2, char3);

        System.out.println(charSum);
    }
}
