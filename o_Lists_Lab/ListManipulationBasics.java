package o_Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String[] command = scanner.nextLine().split(" ");

            if (command[0].equals("end")) {
                String output = formatOutput(integerList, " ");
                System.out.println(output);
                break;
            }

            int number;
            int index;

            switch (command[0]) {
                case "Add":
                    number = Integer.parseInt(command[1]);
                    addNumber(integerList, number);
                    break;
                case "Remove":
                    number = Integer.parseInt(command[1]);
                    removeNumber(integerList, number);
                    break;
                case "RemoveAt":
                    index = Integer.parseInt(command[1]);
                    removeNumberAt(integerList, index);
                    break;
                case "Insert":
                    number = Integer.parseInt(command[1]);
                    index = Integer.parseInt(command[2]);
                    insertNumberAr(integerList, index, number);
                    break;
            }
        }
    }

    private static String formatOutput(List<Integer> integerList, String delimiter) {

        String output = "";
        for (Integer integer : integerList) {
            output += integer + delimiter;
        }
        return output.trim();
    }

    private static void insertNumberAr(List<Integer> integerList, int index, int number) {
        integerList.add(index, number);
    }

    private static void removeNumberAt(List<Integer> integerList, int index) {
        integerList.remove(index);
    }

    private static void removeNumber(List<Integer> integerList, int number) {
        integerList.remove(Integer.valueOf(number));
    }

    private static void addNumber(List<Integer> integerList, int number) {
        integerList.add(number);
    }
}
