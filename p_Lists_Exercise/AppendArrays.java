package p_Lists_Exercise;

import java.util.*;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] initialInput = scanner.nextLine().split("\\|");

        List<Integer> outputList = new ArrayList<>();

        List<Integer> indexes = new ArrayList<>();

        int indexer = 0;

        reverseInputListPopulateOutputListAndArrayStartIndexes(initialInput, outputList, indexes, indexer);

        printFormattedOutput(outputList);
    }

    private static void printFormattedOutput(List<Integer> outputList) {

        for (Integer number : outputList) {
            System.out.print(number + " ");
        }
    }

    public static void reverseInputListPopulateOutputListAndArrayStartIndexes(String[] initialInput, List<Integer> outputList, List<Integer> indexes, int indexer) {
        for (int i = initialInput.length - 1; i >= 0 ; i--) {
            indexes.add(indexer);
            for (int j = 0; j < initialInput[i].length(); j++) {
                if (initialInput[i].charAt(j) > 47 && initialInput[i].charAt(j) < 58) {
                    outputList.add(Character.getNumericValue(initialInput[i].charAt(j)));
                }
            }
            indexer += outputList.size() - indexer;
        }
    }
}
