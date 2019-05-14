package m_Methods_Exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startChar = scanner.nextLine().charAt(0);
        char endChar = scanner.nextLine().charAt(0);

        if (startChar > endChar) {
            char temp = startChar;
            startChar = endChar;
            endChar = temp;
        }

        printAllCharsBetweenStartAndEnd(startChar, endChar);
    }

    private static void printAllCharsBetweenStartAndEnd(char startChar, char endChar) {

        for (int i = startChar + 1 ; i < endChar; i++) {
            System.out.print((char)i + " ");
        }
    }
}
