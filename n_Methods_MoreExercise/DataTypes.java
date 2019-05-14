package n_Methods_MoreExercise;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine();

        switch (dataType) {
            case "int":
                printResultForDataType(Integer.parseInt(scanner.nextLine()));
                break;
            case "real":
                printResultForDataType(Double.parseDouble(scanner.nextLine()));
                break;
            case "string":
                printResultForDataType(scanner.nextLine());
                break;
        }

    }
    public static void printResultForDataType(int number) {
        System.out.println(number * 2);
    }
    public static void printResultForDataType(double number) {
        System.out.printf("%.2f\n", (number * 1.5));
    }
    public static void printResultForDataType(String input) {
        System.out.printf("$%s$", input);
    }
}
