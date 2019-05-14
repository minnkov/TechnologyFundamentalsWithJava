package x_TextProcessingAndRegularExpressions_Lab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String keyWord = scanner.nextLine();

        String text = scanner.nextLine();

        while (text.contains(keyWord)) {

            int keyWordStartIndex = text.indexOf(keyWord);

            String leftPart = text.substring(0, keyWordStartIndex);

            String rightPart = text.substring(keyWordStartIndex + keyWord.length());

            text = leftPart + rightPart;

        }

        System.out.println(text);
    }
}
