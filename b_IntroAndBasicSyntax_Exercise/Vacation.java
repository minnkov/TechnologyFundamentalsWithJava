package b_IntroAndBasicSyntax_Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        
        double pricePerPerson = 0;
        double totalPrice = 0;

        
        switch (dayOfTheWeek) {
            case "Friday":
                if (groupType.equals("Students")) {
                    pricePerPerson = 8.45;
                    totalPrice = groupCount * pricePerPerson;
                    if (groupCount >= 30) {
                        totalPrice *= 0.85;
                    }
                } else if (groupType.equals("Business")) {
                    pricePerPerson = 10.90;
                    totalPrice = groupCount * pricePerPerson;
                    if (groupCount >= 100) {
                        totalPrice -= pricePerPerson * 10;
                    }
                } else if (groupType.equals("Regular")) {
                    pricePerPerson = 15;
                    totalPrice = groupCount * pricePerPerson;
                    if (groupCount >= 10 && groupCount <= 20) {
                        totalPrice *= 0.95;
                    }
                }
                break;
            case "Saturday":
                if (groupType.equals("Students")) {
                    pricePerPerson = 9.80;
                    totalPrice = groupCount * pricePerPerson;
                    if (groupCount >= 30) {
                        totalPrice *= 0.85;
                    }
                } else if (groupType.equals("Business")) {
                    pricePerPerson = 15.60;
                    totalPrice = groupCount * pricePerPerson;
                    if (groupCount >= 100) {
                        totalPrice -= pricePerPerson * 10;
                    }
                } else if (groupType.equals("Regular")) {
                    pricePerPerson = 20;
                    totalPrice = groupCount * pricePerPerson;
                    if (groupCount >= 10 && groupCount <= 20) {
                        totalPrice *= 0.95;
                    }
                }
                break;
            case "Sunday":
                if (groupType.equals("Students")) {
                    pricePerPerson = 10.46;
                    totalPrice = groupCount * pricePerPerson;
                    if (groupCount >= 30) {
                        totalPrice *= 0.85;
                    }
                } else if (groupType.equals("Business")) {
                    pricePerPerson = 16;
                    totalPrice = groupCount * pricePerPerson;
                    if (groupCount >= 100) {
                        totalPrice -= pricePerPerson * 10;
                    }
                } else if (groupType.equals("Regular")) {
                    pricePerPerson = 22.50;
                    totalPrice = groupCount * pricePerPerson;
                    if (groupCount >= 10 && groupCount <= 20) {
                        totalPrice *= 0.95;
                    }
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
