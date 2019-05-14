package o_Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String[] command = scanner.nextLine().split(" ");

            if (command[0].equals("end")) {
                break;
            }

            int number;

            switch (command[0]) {
                case "Contains":
                    number = Integer.parseInt(command[1]);
                    checkIfListContainsNumber(integerList, number);
                    break;
                case "Print":
                    String oddOrEven = command[1];
                    printAllOddOrEvenNumbers(integerList, oddOrEven);
                    break;
                case "Get":
                    if (command[1].equals("sum")) {
                        printSumOfAllNumbers(integerList);
                    }
                    break;
                case "Filter":
                    String condition = command[1];
                    number = Integer.parseInt(command[2]);
                    printAllfilteredNumbers(integerList, condition, number);
                    break;
            }
        }
    }

    private static void printAllfilteredNumbers(List<Integer> integerList, String condition, int number) {

        switch (condition) {
            case ">":
                for (Integer numberFromList : integerList) {
                    if (numberFromList > number) {
                        System.out.print(numberFromList + " ");
                    }
                }
                break;
            case "<":
                for (Integer numberFromList : integerList) {
                    if (numberFromList < number) {
                        System.out.print(numberFromList + " ");
                    }
                }
                break;
            case ">=":
                for (Integer numberFromList : integerList) {
                    if (numberFromList >= number) {
                        System.out.print(numberFromList + " ");
                    }
                }
                break;
            case "<=":
                for (Integer numberFromList : integerList) {
                    if (numberFromList <= number) {
                        System.out.print(numberFromList + " ");
                    }
                }
                break;
        }
        System.out.println();
    }

    private static void printSumOfAllNumbers(List<Integer> integerList) {
        int sum = 0;

        for (Integer number : integerList) {
            sum += number;
        }
        System.out.println(sum);
    }

    private static void printAllOddOrEvenNumbers(List<Integer> integerList, String oddOrEven) {

        switch (oddOrEven) {
            case "odd":
                for (Integer integer : integerList) {
                    if (integer % 2 != 0) {
                        System.out.print(integer + " ");
                    }
                }
                break;
            case "even":
                for (Integer integer : integerList) {
                    if (integer % 2 == 0) {
                        System.out.print(integer + " ");
                    }
                }
                break;
        }
        System.out.println();
    }

    private static void checkIfListContainsNumber(List<Integer> integerList, int number) {
        if (integerList.contains(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }
}
