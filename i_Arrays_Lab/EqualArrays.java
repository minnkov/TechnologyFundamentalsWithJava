package i_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        int i = 0;

        for (i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                System.out.println("Arrays are not identical. Found difference at " + i + " index.");
                break;
            }
            sum += firstArray[i];
        }
        if (i == firstArray.length) {
            System.out.println("Arrays are identical. Sum: " + sum);
        }
    }
}
