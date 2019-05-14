package r_BitwiseOperations;

import java.util.Scanner;

public class firstBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        // bit at position 1

        int bitAtPositionOne = 0;

        number = number >> 1;

        bitAtPositionOne = number & 1;

        System.out.println(bitAtPositionOne);
    }
}
