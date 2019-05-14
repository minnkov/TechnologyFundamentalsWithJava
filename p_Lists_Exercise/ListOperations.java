package p_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String[] command = scanner.nextLine().split(" ");

            if (command[0].equals("End")) {
                printList(inputList);
                break;
            }

            int number, index, count;

            switch (command[0]) {
                case "Add":
                    number = Integer.parseInt(command[1]);
                    addNumberToEndOfArray(inputList, number);
                    break;
                case "Insert":
                    number = Integer.parseInt(command[1]);
                    index = Integer.parseInt(command[2]);

                    if (index < 0 || index > inputList.size()) {
                        //todo might need to be index >=inputList.size()
                        System.out.println("Invalid index");
                        continue;
                    }

                    insertNumberAtGivenIndex(inputList, number, index);
                    break;
                case "Remove":
                    index = Integer.parseInt(command[1]);

                    if (index < 0 || index >= inputList.size()) {
                        System.out.println("Invalid index");
                        continue;
                    }

                    removeNumberAtIndex(inputList, index);
                    break;
                case "Shift":
                    String leftOrRight = command[1];
                    count = Integer.parseInt(command[2]);
                    if (count >= inputList.size()) {
                        count %= inputList.size();
                    }

                    shiftListLeftOrRight(inputList, leftOrRight, count);
                    break;
            }
        }
    }

    private static void printList(List<Integer> inputList) {
        for (Integer number : inputList) {
            System.out.print(number + " ");
        }
    }

    private static void shiftListLeftOrRight(List<Integer> inputList, String leftOrRight, int count) {

        switch (leftOrRight) {
            case "left":
                for (int i = 0; i < count; i++) {
                    inputList.add(inputList.get(0));
                    inputList.remove(0);
                }
                break;
            case "right":
                for (int i = 0; i < count; i++) {
                    inputList.add(0, inputList.get(inputList.size() - 1));
                    inputList.remove(inputList.size() - 1);
                }
                break;
        }
    }

    private static void removeNumberAtIndex(List<Integer> inputList, int index) {
        inputList.remove(index);
    }

    private static void insertNumberAtGivenIndex(List<Integer> inputList, int number, int index) {
        inputList.add(index, number);
    }

    private static void addNumberToEndOfArray(List<Integer> inputList, int number) {
        inputList.add(number);
    }
}
