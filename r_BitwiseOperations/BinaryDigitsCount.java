package r_BitwiseOperations;

import java.util.Scanner;

public class BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        String binaryString = Integer.toBinaryString(n);

        int bCounter = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            if (Character.getNumericValue(binaryString.charAt(i)) == b) {
                bCounter++;
            }
        }
        System.out.println(bCounter);
    }
}
