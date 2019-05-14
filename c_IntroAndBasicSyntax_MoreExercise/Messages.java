package c_IntroAndBasicSyntax_MoreExercise;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = "";
        int letterCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < letterCount; i++) {

            String numberString = scanner.nextLine();
            int digitCounter = numberString.length();
            char mainDigitChar = numberString.charAt(0);
            int mainDigit = Character.getNumericValue(mainDigitChar);
            int offset = 0;

            if (mainDigit == 8 || mainDigit == 9) {
                offset = (mainDigit - 2) * 3 + 1;
            } else {
                offset = (mainDigit - 2) * 3;
            }
            int letterIndex = (offset + digitCounter - 1);
            int letterASCII = 97 + letterIndex;
            if (mainDigit == 0) {
                letterASCII = 32;
            }
            char letter = (char)letterASCII;

            message += letter;
        }
        System.out.println(message);
    }
}
