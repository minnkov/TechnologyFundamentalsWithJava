package x_TextProcessingAndRegularExpressions_Lab;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "\\+359(?<delimiter>[ |-])2\\k<delimiter>\\d{3}\\k<delimiter>\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher phoneMatcher = pattern.matcher(input);

        List<String> validPhoneNumbers = new LinkedList<>();

        while (phoneMatcher.find()) {

            validPhoneNumbers.add(phoneMatcher.group());
        }

        System.out.println(validPhoneNumbers.toString().replaceAll("[\\[\\]]", ""));
    }
}
