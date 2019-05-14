package i_Arrays_Lab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] numbers = new String[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLine();
        }
        for (int i = numbers.length - 1; i >= 0 ; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
