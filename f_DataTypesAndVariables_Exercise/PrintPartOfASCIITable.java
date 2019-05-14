package f_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialChar = Integer.parseInt(scanner.nextLine());
        int finalChar = Integer.parseInt(scanner.nextLine());

        for (int i = initialChar; i <= finalChar ; i++) {
            char currentChar = (char)i;
            System.out.printf("%c ", currentChar);
        }
    }
}
