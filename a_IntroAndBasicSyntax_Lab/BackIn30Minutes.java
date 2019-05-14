package a_IntroAndBasicSyntax_Lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hours * 60 + minutes + 30;

        int totalHours = totalMinutes / 60;
        int minutesLeft = totalMinutes % 60;

        if (totalHours > 23) {
            totalHours = 0;
        }

        if (minutesLeft < 10) {
            System.out.printf("%d:0%d", totalHours, minutesLeft);
        } else {
            System.out.printf("%d:%d", totalHours, minutesLeft);
        }

    }
}
