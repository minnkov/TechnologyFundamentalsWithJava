package m_Methods_Exercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        int vowelsCount = countVowels(input);
        printVowelsCount(vowelsCount);
    }

    private static void printVowelsCount(int vowelsCount) {
        System.out.println(vowelsCount);
    }

    private static int countVowels(String input) {

        int vowelCounter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'o' || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i' || input.charAt(i) == 'u') {
                vowelCounter++;
            }
        }
        return vowelCounter;
    }
}
