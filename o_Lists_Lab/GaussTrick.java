package o_Lists_Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputString = scanner.nextLine().split(" ");

        List<Integer> inputNumeric = new ArrayList<>();

        for (int i = 0; i < inputString.length; i++) {
            inputNumeric.add(i, Integer.parseInt(inputString[i]));
        }

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < inputNumeric.size() / 2; i++) {
            resultList.add(i, (inputNumeric.get(i) + inputNumeric.get(inputNumeric
            .size() - 1 - i)));
        }

        if (inputNumeric.size() % 2 != 0) {
            resultList.add(inputNumeric.get(inputNumeric.size() /2 ));
        }

        String output = generateOutputFormat(resultList, " ");
        System.out.println(output);
    }

    private static String generateOutputFormat(List<Integer> resultList, String delimiter) {
        String output = "";

        for (int i = 0; i < resultList.size(); i++) {
            output += resultList.get(i) + delimiter;
        }
        return output.trim();
    }
}
