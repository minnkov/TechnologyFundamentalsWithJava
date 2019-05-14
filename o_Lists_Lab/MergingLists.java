package o_Lists_Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxLength = Math.max(firstList.size(), secondList.size());

        List<Integer> combinedList = new ArrayList<>();

        int combinedListIndexer = 0;

        for (int i = 0; i < maxLength; i++) {
            if (i < firstList.size()) {
                combinedList.add(combinedListIndexer, firstList.get(i));
                combinedListIndexer++;
            }

            if (i < secondList.size()) {
                combinedList.add(combinedListIndexer, secondList.get(i));
                combinedListIndexer++;
            }
        }

        String output = formatOutput(combinedList, " ");
        System.out.println(output);
    }

    private static String formatOutput(List<Integer> combinedList, String delimiter) {
        String output = "";

        for (Integer integer : combinedList) {
            output += integer + delimiter;
        }

        return output.trim();
    }
}
