package m_Methods_Exercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        isPasswordValid(password);
    }

    public static void isPasswordValid(String password) {
        boolean isPasswordLengthSufficient = checkIfPasswordLengthIsSufficient(password);
        boolean hasOnlyLettersAndDigits = checkIfOnlyLettersAndDigits(password);
        boolean hasAtLeastTwoDigits = checkIfAtLeastTwoDigits(password);

        if (!isPasswordLengthSufficient) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!hasOnlyLettersAndDigits) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!hasAtLeastTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isPasswordLengthSufficient && hasOnlyLettersAndDigits && hasAtLeastTwoDigits) {
            System.out.println("Password is valid");
        }
    }

    private static boolean checkIfPasswordLengthIsSufficient(String password) {
        if (password.length() < 6 || password.length() > 10) {
            return false;
        }

        return true;
    }

    private static boolean checkIfAtLeastTwoDigits(String password) {

        int digitCounter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) > 47 && password.charAt(i) < 58) {
                digitCounter++;
            }
        }
        if (digitCounter < 2) {
            return false;
        }
        return true;
    }

    private static boolean checkIfOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) < 48 || password.charAt(i) > 57 && password.charAt(i) < 65
                    || password.charAt(i) > 90 && password.charAt(i) < 97 || password.charAt(i) > 122) {
                return false;
            }
        }
        return true;
    }
}
