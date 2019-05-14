package i_Arrays_Lab;

import java.util.Scanner;

public class ReverseArrayOfStrings_exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] stringArray = scanner.nextLine().split(" ");

        for (int i = 0; i < stringArray.length / 2; i++) {

            String temp = stringArray[i];
            stringArray[i] = stringArray[stringArray.length - 1 - i];
            stringArray[stringArray.length - 1 - i] = temp;
        }
        System.out.println(String.join(" ", stringArray));
    }
}
