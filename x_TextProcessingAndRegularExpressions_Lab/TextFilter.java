package x_TextProcessingAndRegularExpressions_Lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");

        String text = scanner.nextLine();

        for (int i = 0; i < bannedWords.length; i++) {

            String bannedWord = bannedWords[i];

            String replacement = doMagic(bannedWord);

            text = text.replace(bannedWord, replacement);
        }

        System.out.println(text);
    }

    private static String doMagic(String bannedWord) {
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < bannedWord.length(); i++) {

            temp.append("*");
        }

        return temp.toString();
    }
}
