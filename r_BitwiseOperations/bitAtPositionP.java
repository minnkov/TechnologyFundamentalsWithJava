package r_BitwiseOperations;

import java.util.Scanner;

public class bitAtPositionP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        int bitAtPosiitonP = 0;

        number = number >> p;

        bitAtPosiitonP = number & 1;
        System.out.println(bitAtPosiitonP);
    }
}
