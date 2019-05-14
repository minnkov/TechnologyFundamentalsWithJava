package j_ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] initialArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < initialArray.length; i++) {

            for (int j = i + 1; j < initialArray.length; j++) {
                if (initialArray[i] + initialArray[j] == number) {
                    System.out.println(initialArray[i] + " " + initialArray[j]);
                }
            }
        }
    }
}
