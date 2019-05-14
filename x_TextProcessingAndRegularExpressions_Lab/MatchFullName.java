package x_TextProcessingAndRegularExpressions_Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern fullName = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");
        Matcher matcher = fullName.matcher(input);

        while (matcher.find()) {

            System.out.print(matcher.group() + " ");
        }
    }
}
