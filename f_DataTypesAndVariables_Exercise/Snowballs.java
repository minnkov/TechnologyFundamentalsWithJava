package f_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        int outputSnow = 0;
        int outputTime = 0;
        int outputQuality = 0;

        double snowballMaxValue = Integer.MIN_VALUE;

        for (int i = 0; i < numberOfSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((1.0 * snowballSnow) / ( 1.0 * snowballTime), (snowballQuality));

            if (snowballValue > snowballMaxValue) {
                snowballMaxValue = snowballValue;
                outputSnow = snowballSnow;
                outputTime = snowballTime;
                outputQuality = snowballQuality;

            }
        }
        System.out.printf("%d : %d = %.0f (%d)", outputSnow, outputTime, snowballMaxValue, outputQuality);
    }
}
