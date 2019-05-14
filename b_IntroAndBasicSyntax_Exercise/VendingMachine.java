package b_IntroAndBasicSyntax_Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double coinsSum = 0;
        double coin = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Start")) {
                break;
            } else {
                coin = Double.valueOf(input);
                if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                    coinsSum += coin;
                } else {
                    System.out.printf("Cannot accept %.2f%n", coin);
                }

            }

        }

        toshko:
        while (true) {
            String product = scanner.nextLine();
            double productPrice = 0;

            switch (product) {
                case "Nuts":
                    productPrice = 2.0;
                    coinsSum -= productPrice;
                    if (coinsSum >= 0) {
                        System.out.println("Purchased " + product);
                    } else {
                        coinsSum += productPrice;
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    productPrice = 0.7;
                    coinsSum -= productPrice;
                    if (coinsSum >= 0) {
                        System.out.println("Purchased " + product);
                    } else {
                        coinsSum += productPrice;
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    coinsSum -= productPrice;
                    if (coinsSum >= 0) {
                        System.out.println("Purchased " + product);
                    } else {
                        coinsSum += productPrice;
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    productPrice = 0.8;
                    coinsSum -= productPrice;
                    if (coinsSum >= 0) {
                        System.out.println("Purchased " + product);
                    } else {
                        coinsSum += productPrice;
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    productPrice = 1.0;
                    coinsSum -= productPrice;
                    if (coinsSum >= 0) {
                        System.out.println("Purchased " + product);
                    } else {
                        coinsSum += productPrice;
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "End":
                    System.out.printf("Change: %.2f", coinsSum);
                    break toshko;
                default:
                    System.out.println("Invalid product");
                    break;
            }

        }
    }
}
