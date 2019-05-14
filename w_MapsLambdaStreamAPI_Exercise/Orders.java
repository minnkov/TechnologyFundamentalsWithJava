package w_MapsLambdaStreamAPI_Exercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> products = new LinkedHashMap<>();

        while (true) {

            String[] input = scanner.nextLine().split(" ");

            if (input[0].equals("buy")) {
                printProductAndTotalPrice(products);
                break;
            }

            String product = input[0];
            double price = Double.parseDouble(input[1]);
            double quantity = Double.parseDouble(input[2]);

            if (!products.containsKey(product)) {
                products.put(product, new ArrayList<>());
                products.get(product).add(price);
                products.get(product).add(quantity);
            } else {
                double currentPrice = products.get(product).get(0);
                double newQuantity = products.get(product).get(1) + quantity;
                products.get(product).set(1, newQuantity);

                if (currentPrice != price) {
                    products.get(product).set(0, price);
                }
            }
        }
    }

    private static void printProductAndTotalPrice(Map<String, List<Double>> products) {
        String pattern = "%s -> %.2f";

        for (Map.Entry<String, List<Double>> kvp : products.entrySet()) {

            double totalPrice = (kvp.getValue().get(0)) * (kvp.getValue().get(1));

            System.out.println(String.format(pattern, kvp.getKey(), totalPrice));
        }
    }
}
