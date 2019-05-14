package j_ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxCount = 0;
        int sequenceIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int currentCount = 0;
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    currentCount++;
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        sequenceIndex = i;
                    }
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(array[sequenceIndex] + " ");
        }
    }
}
