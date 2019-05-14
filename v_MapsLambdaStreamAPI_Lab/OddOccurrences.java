package v_MapsLambdaStreamAPI_Lab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().toLowerCase().split(" ");

        Map<String, Integer> wordsMap = new LinkedHashMap<>();

        for (String word : input) {

            wordsMap.putIfAbsent(word, 0);
            wordsMap.put(word, wordsMap.get(word) + 1);
        }

        List<String> oddOccurences = new ArrayList<>();

        for (Map.Entry<String, Integer> kvp : wordsMap.entrySet()) {
            if (kvp.getValue() % 2 != 0) {
                oddOccurences.add(kvp.getKey());
            }
        }

        String output = String.join(", ", oddOccurences);

        System.out.println(output);
    }
}
