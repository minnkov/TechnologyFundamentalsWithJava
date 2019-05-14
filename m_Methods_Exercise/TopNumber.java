package m_Methods_Exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            printMasterNumber(i);
        }

    }

    private static void printMasterNumber(int i) {

        if (checkIfSumIsDivisibleBy8(i) && checkForOddDigits(i)) {
            System.out.println(i);
        }
    }

    private static boolean checkForOddDigits(int i) {
        String number = String.valueOf(i);

        for (int j = 0; j < number.length(); j++) {
            int digit = Character.getNumericValue(number.charAt(j));
            if (digit % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkIfSumIsDivisibleBy8(int i) {
        String number = String.valueOf(i);
        int sum = 0;

        for (int j = 0; j < number.length(); j++) {
            int digit = Character.getNumericValue(number.charAt(j));
            sum += digit;
        }
        if (sum % 8 == 0) {
            return true;
        }

        return false;
    }
}
