package w_MapsLambdaStreamAPI_Exercise;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyResources = new HashMap<>();
        keyResources.putIfAbsent("shards", 0);
        keyResources.putIfAbsent("fragments", 0);
        keyResources.putIfAbsent("motes", 0);

        Map<String, Integer> junkResources = new HashMap<>();

        genata:
        while (true) {

            String[] input = scanner.nextLine().split("\\s+");

            for (int i = 0; i < input.length; i += 2) {

                int quantity = Integer.parseInt(input[i]);
                String resource = input[i + 1].toLowerCase();

                if (resource.equals("shards") || resource.equals("fragments") || resource.equals("motes")) {

                    keyResources.put(resource, keyResources.get(resource) + quantity);

                    if (keyResources.get(resource) >= 250) {

                        keyResources.put(resource, keyResources.get(resource) - 250);
                        printForgedLegendaryItem(resource);
                        break genata;
                    }
                } else {

                    junkResources.putIfAbsent(resource, 0);
                    junkResources.put(resource, junkResources.get(resource) + quantity);
                }
            }
        }

        keyResources.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        junkResources.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

    }

    private static void printForgedLegendaryItem(String resource) {

        String winner = "";

        switch (resource) {
            case "shards":
                winner = "•Shadowmourne";
                break;
            case "fragments":
                winner = "Valanyr";
                break;
            case "motes":
                winner = "Dragonwrath";
                break;
        }
        System.out.println(winner + " obtained!");
    }
}
