package n_Methods_MoreExercise;

import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        printLongestLine(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    private static void printLongestLine(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

        int firstPointDistanceSum = Math.abs(x1) + Math.abs(y1);
        int secondPointDistanceSum = Math.abs(x2) + Math.abs(y2);
        int thirdPointDistanceSum = Math.abs(x3) + Math.abs(y3);
        int fourthPointDistanceSum = Math.abs(x4) + Math.abs(y4);

        int firstLineLengthSum = Math.abs(x1 + x2) + Math.abs(y1 + y2);
        int secondLineLengthSum = Math.abs(x3 + x4) + Math.abs(y3 + y4);

        if (firstLineLengthSum >= secondLineLengthSum) {
            if (firstPointDistanceSum <= secondPointDistanceSum) {
                System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
            }
        } else if (secondLineLengthSum > firstLineLengthSum) {
            if (thirdPointDistanceSum <= fourthPointDistanceSum) {
                System.out.printf("(%d, %d)(%d, %d)", x3, y3, x4, y4);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x4, y4, x3, y3);
            }
        }
    }
}
