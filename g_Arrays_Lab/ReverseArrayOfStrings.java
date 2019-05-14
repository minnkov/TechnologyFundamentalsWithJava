package i_Arrays_Lab;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputString = scanner.nextLine().split(" ");
        String[] outputString = new String[inputString.length];
        int m = 0;

        for (int i = inputString.length - 1; i >= 0 ; i--) {

            outputString[m] = inputString[i];
            m++;
        }
        System.out.print(String.join(" ", outputString));
    }
}
