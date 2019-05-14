package p_Lists_Exercise;

import java.util.*;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");

        List<String> inputList = new ArrayList<>(); Collections.addAll(inputList, inputArray);

        while (true) {
            String[] command = scanner.nextLine().split(" ");

            if (command[0].equals("3:1")) {
                printListValuesSpaceSeparated(inputList);

                break;
            }
            int startIndex, endIndex, index, partitions;

            if (command[0].equals("merge")) {
                startIndex = Integer.parseInt(command[1]);
                endIndex = Integer.parseInt(command[2]);

                if (startIndex > inputList.size() - 1 || endIndex < 0) {
                    continue;
                }
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > inputList.size() - 1) {
                    endIndex = inputList.size() - 1;
                }

                doTheMerge(inputList, startIndex, endIndex);
            } else if (command[0].equals("divide")) {
                index = Integer.parseInt(command[1]);
                partitions = Integer.parseInt(command[2]);

                if (index < 0 || index > inputList.size() - 1) {
                    continue;
                }

                divideListElement(inputList, index, partitions);
            }
        }
    }

    private static void printListValuesSpaceSeparated(List<String> inputList) {

        for (String element : inputList) {
            System.out.print(element + " ");
        }
    }

    private static void divideListElement(List<String> inputList, int index, int partitions) {

        int elementSize = inputList.get(index).length();
        int numberOfCharsInpartition = elementSize / partitions;
        int lastPartitionAddition = elementSize % partitions;

        String elementToDivide = inputList.get(index);
        int substringStartIndex = 0;

        if (lastPartitionAddition != 0) {
            substringStartIndex = elementSize - numberOfCharsInpartition - lastPartitionAddition;
        } else {
            substringStartIndex = elementSize - numberOfCharsInpartition;
        }

        for (int i = 0; i < partitions; i++) {
            String temp = "";

            int tempIndex = substringStartIndex;

            if (i == 0 && lastPartitionAddition != 0) {
                for (int j = 0; j < numberOfCharsInpartition + lastPartitionAddition; j++) {
                    temp += elementToDivide.charAt(tempIndex);
                    tempIndex++;
                }
            } else {
                for (int j = 0; j < numberOfCharsInpartition; j++) {
                    temp += elementToDivide.charAt(tempIndex);
                    tempIndex++;
                }
            }
            substringStartIndex -= numberOfCharsInpartition;
            inputList.add(index + 1, temp);
        }
        inputList.remove(index);
    }

    private static void doTheMerge(List<String> inputList, int startIndex, int endIndex) {

        int mergeCounter = endIndex - startIndex;

        for (int i = 0; i < mergeCounter; i++) {
            String newValue = inputList.get(startIndex) + inputList.get(startIndex + 1);
            inputList.set(startIndex, newValue);
            inputList.remove(startIndex + 1);
        }
    }
}
