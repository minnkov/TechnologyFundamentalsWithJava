package w_MapsLambdaStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar != ' ') {
                charCount.putIfAbsent(currentChar, 0);
                charCount.put(currentChar, charCount.get(currentChar) + 1);
            }
        }

        String outputFormat = "%c -> %d";

        for (Map.Entry<Character, Integer> kvp : charCount.entrySet()) {
            System.out.println(String.format(outputFormat, kvp.getKey(), kvp.getValue()));
        }
    }
}
