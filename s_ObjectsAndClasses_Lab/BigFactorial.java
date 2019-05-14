package s_ObjectsAndClasses_Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        BigInteger result = BigInteger.ONE;

        for (int i = number; i > 0 ; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}
