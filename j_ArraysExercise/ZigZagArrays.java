package j_ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[n];
        String[] secondArray = new String[n];


        for (int i = 0; i < n; i++) {

            String[] arrayString = scanner.nextLine().split(" ");

            if (i == 0 || i % 2 == 0){
                firstArray[i] = arrayString[0];
                secondArray[i] = arrayString[1];
            } else {
                firstArray[i] = arrayString[1];
                secondArray[i] = arrayString[0];
            }

        }
        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));
    }
}
