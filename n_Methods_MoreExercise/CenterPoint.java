package n_Methods_MoreExercise;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        printClosestPoint(x1, y1, x2, y2);
    }

    private static void printClosestPoint(int x1, int y1, int x2, int y2) {

        int firstPointDistanceSum = Math.abs(x1) + Math.abs(y1);
        int secondPointDistanceSum = Math.abs(x2) + Math.abs(y2);

        if (firstPointDistanceSum <= secondPointDistanceSum) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }

    }
}
