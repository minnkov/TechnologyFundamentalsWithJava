package a_IntroAndBasicSyntax_Lab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int oddSum = 0;
        int oddCounter = 0;

        for (int i = 1; i >= 0; i++) {

            if (i % 2 != 0) {
                oddSum += i;
                oddCounter ++;
                System.out.println(i);
            }
            if (oddCounter == n) {
                break;
            }

        }
        System.out.println("Sum: " + oddSum);
    }
}
