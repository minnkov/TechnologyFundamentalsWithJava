package b_IntroAndBasicSyntax_Exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCrashCounter = 0;
        int mouseCrashCounter = 0;
        int keyboardCrashCounter = 0;
        int displayCrashCounter = 0;

        for (int i = 1; i <= lostGamesCount; i++) {
            if (i % 6 == 0) {
                headsetCrashCounter++;
                mouseCrashCounter++;
                keyboardCrashCounter++;
                if (keyboardCrashCounter % 2 == 0) {
                    displayCrashCounter++;
                }
            } else if (i % 2 == 0) {
                headsetCrashCounter++;
            } else if (i % 3 == 0) {
                mouseCrashCounter++;
            }
        }
        double totalPrice = (headsetCrashCounter * headsetPrice) + (mouseCrashCounter * mousePrice) + (keyboardCrashCounter
                * keyboardPrice) + (displayCrashCounter * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);

        /* Lower Memory consumption:

        int headsetCrashCounter = lostGamesCount / 2;
        int mouseCrashCounter = lostGamesCount / 3;
        int keyboardCrashCounter = lostGamesCount / 6;
        int displayCrashCounter = keyboardCrashCounter / 2;

        double totalPrice = (headsetCrashCounter * headsetPrice) + (mouseCrashCounter * mousePrice) + (keyboardCrashCounter
                * keyboardPrice) + (displayCrashCounter * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", totalPrice); */

    }
}
