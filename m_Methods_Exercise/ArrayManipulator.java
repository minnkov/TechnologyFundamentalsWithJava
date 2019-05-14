package m_Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (true) {
            String[] command = scanner.nextLine().split(" ");

            if (command[0].equals("end")) {
                break;
            }
            if (command[0].equals("exchange")) {
                int index = Integer.parseInt(command[1]);
                if (index < 0 || index > input.length - 1) {
                    System.out.println("Invalid index");
                    continue;
                }
                int[] outputArray = exchange(input, index);
                for (int i = 0; i < outputArray.length; i++) {
                    input[i] = outputArray[i];
                }

            } else if (command[0].equals("max")) {
                printMaxEvenOrOddIndex(input, command[1]);
            } else if (command[0].equals("min")) {
                printMinEvenOrOddIndex(input, command[1]);
            } else if (command[0].equals("first") || command[0].equals("last")) {
                int count = Integer.parseInt(command[1]);
                if (count > input.length) {
                    System.out.println("Invalid count");
                    continue;
                }
                printFirstNEvenOrOddElements(input, count, command[0], command[2]);
            }
        }
        System.out.print("[");
        for (int i = 0; i < input.length; i++) {
            if (i == 0) {
                System.out.print(input[i]);
            } else {
                System.out.print(", " + input[i]);
            }
        }
        System.out.println("]");
    }

    private static void printFirstNEvenOrOddElements(int[] input, int count, String firstOrLast, String evenOrOdd) {

        int counter = 0;

        System.out.print("[");
        if (firstOrLast.equals("first")) {
            if (evenOrOdd.equals("even")) {
                for (int i = 0; i < input.length; i++) {
                    if (counter == count) {
                        break;
                    }
                    if (input[i] % 2 == 0) {
                        if (counter == 0) {
                            System.out.print(input[i]);
                        } else {
                            System.out.print(", " + input[i]);
                        }
                        counter++;
                    }
                }
            } else if (evenOrOdd.equals("odd")) {
                for (int i = 0; i < input.length; i++) {
                    if (counter == count) {
                        break;
                    }
                    if (input[i] % 2 != 0) {
                        if (counter == 0) {
                            System.out.print(input[i]);
                        } else {
                            System.out.print(", " + input[i]);
                        }
                        counter++;
                    }
                }
            }
        } else if (firstOrLast.equals("last")) {
            counter = 0;
            int[] outputArray = new int[count];
            if (evenOrOdd.equals("even")) {
                for (int i = input.length - 1; i >= 0; i--) {
                    if (count == 0) {
                        break;
                    }
                    if (input[i] % 2 == 0) {
                        outputArray[counter] = input[i];
                        counter--;
                    }
                }
            } else if (evenOrOdd.equals("odd")) {
                for (int i = input.length - 1; i >= 0; i--) {
                    if (count == 0) {
                        break;
                    }
                    if (input[i] % 2 != 0) {
                        outputArray[counter] = input[i];
                        counter--;
                    }

                }
            }
            for (int i = 0; i < outputArray.length; i++) {
                if (outputArray[i] != 0) {
                    if (i == 0) {
                        System.out.print(outputArray[i]);
                    } else {
                        System.out.print(", " + outputArray[i]);
                    }
                }
            }
        }

        System.out.println("]");

    }

    private static void printMinEvenOrOddIndex(int[] input, String evenOrOdd) {
        int minValue = Integer.MAX_VALUE;
        int index = -1;
        if (evenOrOdd.equals("even")) {
            for (int i = 0; i < input.length; i++) {
                if (input[i] % 2 == 0 && input[i] <= minValue) {
                    minValue = input[i];
                    index = i;
                }
            }
        } else if (evenOrOdd.equals("odd")) {
            for (int i = 0; i < input.length; i++) {
                if (input[i] % 2 != 0 && input[i] <= minValue) {
                    minValue = input[i];
                    index = i;
                }
            }

        }
        if (index > -1) {
            System.out.println(index);
        } else {
            System.out.println("No matches");
        }
    }

    private static void printMaxEvenOrOddIndex(int[] input, String evenOrOdd) {

        int maxValue = Integer.MIN_VALUE;
        int index = -1;
        if (evenOrOdd.equals("even")) {
            for (int i = 0; i < input.length; i++) {
                if (input[i] % 2 == 0 && input[i] >= maxValue) {
                    maxValue = input[i];
                    index = i;
                }
            }
        } else if (evenOrOdd.equals("odd")) {
            for (int i = 0; i < input.length; i++) {
                if (input[i] % 2 != 0 && input[i] >= maxValue) {
                    maxValue = input[i];
                    index = i;
                }
            }

        }
        if (index > -1) {
            System.out.println(index);
        } else {
            System.out.println("No matches");
        }
    }

    private static int[] exchange(int[] input, int index) {
        int[] output = new int[input.length];

        int firstLoopCounter = 0;
        for (int i = index + 1; i < output.length; i++) {
            output[firstLoopCounter] = input[i];
            firstLoopCounter++;
        }
        int secondLoopCounter = 0;
        for (int i = firstLoopCounter; i < output.length; i++) {
            output[i] = input[secondLoopCounter];
            secondLoopCounter++;
        }

        return output;
    }
}
