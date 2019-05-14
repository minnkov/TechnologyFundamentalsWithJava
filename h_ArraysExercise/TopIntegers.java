package j_ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] integerArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < integerArray.length - 1; i++) {
            boolean isTopInteger = true;

            for (int j = i + 1; j < integerArray.length; j++) {
                if (integerArray[i] <= integerArray[j]){
                    isTopInteger = false;
                    break;
                }
            }
            if (isTopInteger) {
                System.out.print(integerArray[i] + " ");
            }
        } if (integerArray[integerArray.length - 1] >= 0)
        System.out.print(integerArray[integerArray.length - 1]);
    }
}
