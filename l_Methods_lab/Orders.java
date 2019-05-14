package l_Methods_lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = productPrice(product);
        totalPriceCalculation(price, quantity);
        
        
    }

    private static void totalPriceCalculation(double price, int quantity) {
        System.out.printf("%.2f", (price * quantity));
    }

    private static double productPrice(String product) {
        double price = 0;
        switch (product) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
        }
        return price;
    }
}
