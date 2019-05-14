package j_ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] intArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < intArray.length; i++) {
            leftSum = 0;
            rightSum = 0;

            //leftSum
            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    leftSum += intArray[j];
                }
            }
            //rightSum
            if (i < intArray.length - 1) {
                for (int j = i + 1; j < intArray.length; j++) {
                    rightSum += intArray[j];
                }
            }

            if (leftSum == rightSum) {
                System.out.println(i);
                break;
            }
        }
        if (leftSum != rightSum) {
            System.out.println("no");
        }
    }
}
