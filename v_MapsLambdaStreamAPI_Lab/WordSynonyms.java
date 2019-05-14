package v_MapsLambdaStreamAPI_Lab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonymsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();

            synonymsMap.putIfAbsent(key, new ArrayList<>());
            synonymsMap.get(key).add(value);
        }

        String pattern = "%s - %s";

        for (Map.Entry<String, List<String>> kvp : synonymsMap.entrySet()) {
            String word = kvp.getKey();
            String synonyms = String.join(", ", kvp.getValue());

            System.out.println(String.format(pattern, word, synonyms));
        }
    }
}
