package k_Arrays_MoreExercise;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] previousArray = new int[n + 1];
        int[] currentArray = new int[n + 1];
        previousArray[0] = 1;
        currentArray[0] = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < currentArray.length - 1; j++) {
                currentArray[j] = previousArray[j - 1] + previousArray[j];
            }
            for (int number : previousArray) {
                if (number != 0) {
                    System.out.print(number + " ");
                }
            }
            for (int j = 0; j < previousArray.length; j++) {
                previousArray[j] = currentArray[j];
            }
            System.out.println();
        }
    }
}
