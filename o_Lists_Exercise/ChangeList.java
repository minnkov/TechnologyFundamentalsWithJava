package p_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while(true) {
            String[] command = scanner.nextLine().split(" ");

            if (command[0].equals("end")) {
                printList(inputList);
                break;
            }

            switch (command[0]) {
                case "Delete":
                    int elementToDelete = Integer.parseInt(command[1]);
                    deleteAllElementsEqualToElement(inputList, elementToDelete);
                    break;
                case "Insert":
                    int elementToInsert = Integer.parseInt(command[1]);
                    int position = Integer.parseInt(command[2]);
                    if (position < 0 || position > inputList.size()) {
                        break;
                    }
                    insertElementInPosition(inputList, elementToInsert, position);
                    break;
            }
        }
    }

    private static void printList(List<Integer> inputList) {
        for (Integer number : inputList) {
            System.out.print(number + " ");
        }
    }

    private static void insertElementInPosition(List<Integer> inputList, int elementToInsert, int position) {
        inputList.add(position, elementToInsert);
    }

    private static void deleteAllElementsEqualToElement(List<Integer> inputList, int element) {
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) == element) {
                inputList.remove(i);
                i--;
            }
        }
    }
}
