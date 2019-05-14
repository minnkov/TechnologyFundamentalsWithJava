package v_MapsLambdaStreamAPI_Lab;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(e -> Double.parseDouble(e))
                .toArray();

        Map<Double, Integer> numsMap = new TreeMap<>();

        for (double number : input) {
            numsMap.putIfAbsent(number, 0);
            numsMap.put(number, numsMap.get(number) + 1);
        }

        String pattern = "%.0f -> %d";

        for (Map.Entry<Double, Integer> kvp : numsMap.entrySet()) {
            System.out.println(String.format(pattern, kvp.getKey(), kvp.getValue()));
        }
    }
}
