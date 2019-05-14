package f_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int totalPouredLiters = 0;

        for (int i = 0; i < n; i++) {
            int litersToPour = Integer.parseInt(scanner.nextLine());
            if (litersToPour > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                capacity -= litersToPour;
                totalPouredLiters += litersToPour;
            }
        }
        System.out.println(totalPouredLiters);
    }
}
