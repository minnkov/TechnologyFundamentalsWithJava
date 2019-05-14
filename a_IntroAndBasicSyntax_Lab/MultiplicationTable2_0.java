package a_IntroAndBasicSyntax_Lab;

import java.util.Scanner;

public class MultiplicationTable2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int initMultiplier = Integer.parseInt(scanner.nextLine());
        int result = 0;

        for (int i = initMultiplier; i <= 10 ; i++) {

            result = n * i;
            System.out.printf("%d X %d = %d%n", n, i, result);
        }
        if (initMultiplier > 10) {
            result = initMultiplier * n;
            System.out.printf("%d X %d = %d%n", n, initMultiplier, result);
        }
    }
}
