package w_MapsLambdaStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourceQuantity = new LinkedHashMap<>();

        while (true) {
            String resource = scanner.nextLine();

            if (resource.equals("stop")) {
                printResourcesAndQuantities(resourceQuantity);
                break;
            }

            int quantity = Integer.parseInt(scanner.nextLine());

            resourceQuantity.putIfAbsent(resource, 0);
            resourceQuantity.put(resource, resourceQuantity.get(resource) + quantity);

        }
    }

    private static void printResourcesAndQuantities(Map<String, Integer> resourceQuantity) {
        String outputPattern = "%s -> %d";

        for (Map.Entry<String, Integer> kvp : resourceQuantity.entrySet()) {
            System.out.println(String.format(outputPattern, kvp.getKey(), kvp.getValue()));
        }
    }
}
