package f_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int remainingYield = startingYield;
        int dayCounter = 0;
        int totalStorage = 0;


        while (remainingYield >= 100) {
            int yieldMinedPerDay = remainingYield;
            totalStorage += (yieldMinedPerDay - 26);
            remainingYield -= 10;
            dayCounter++;
        }
        if (totalStorage >= 26) {
            totalStorage -= 26;
        } else {
            totalStorage = 0;
        }
        System.out.println(dayCounter);
        System.out.println(totalStorage);
    }
}
