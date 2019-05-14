package q_Lists_More_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numericList = scanner.nextLine().split(" ");

        String[] initialText = scanner.nextLine().split("");

        List<Character> charList = new ArrayList<>();

        populateCharListWIthInitialTextChars(initialText, charList);

        String output = "";

        for (int i = 0; i < numericList.length; i++) {
            int sum = 0;

            for (int j = 0; j < numericList[i].length(); j++) {
                int digit = Character.getNumericValue(numericList[i].charAt(j));
                sum += digit;
            }

            if (sum >= charList.size()) {
                sum %= charList.size();
            }

            output += charList.get(sum);
            charList.remove(sum);
        }

        System.out.println(output);
    }

    public static void populateCharListWIthInitialTextChars(String[] initialText, List<Character> charList) {
        for (String textElement : initialText) {
            for (int i = 0; i < textElement.length(); i++) {
                charList.add(textElement.charAt(i));
            }
        }
    }
}
