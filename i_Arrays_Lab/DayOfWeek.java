package i_Arrays_Lab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int input = Integer.parseInt(scanner.nextLine());

        if (input < 1 || input > 7) {
            System.out.println("Invalid day!");
        } else {
            System.out.println(dayOfWeek[input - 1]);
        }
    }
}
