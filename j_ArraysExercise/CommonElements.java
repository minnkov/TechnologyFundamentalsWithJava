package j_ArraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstElementsArray = scanner.nextLine().split(" ");
        String[] secondElementsArray = scanner.nextLine().split(" ");

        for (String elementFromSecondArray : secondElementsArray) {

            for (String elementFromFirstArray : firstElementsArray) {
                if (elementFromFirstArray.equals(elementFromSecondArray)) {
                    System.out.print(elementFromSecondArray + " ");
                }
            }
        }
    }
}
