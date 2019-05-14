package l_Methods_lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valueType = scanner.nextLine();
        String firstValue = scanner.nextLine();
        String secondValue = scanner.nextLine();

        if (valueType.equals("int")) {
            int maxValue = getMax(Integer.parseInt(firstValue), Integer.parseInt(secondValue));
            System.out.println(maxValue);
        } else if (valueType.equals("char")) {
            char maxValue = getMax(firstValue.charAt(0), secondValue.charAt(0));
            System.out.println(maxValue);
        } else if (valueType.equals("String")){
            String maxValue = getMax(firstValue, secondValue);
            System.out.println(maxValue);
        }
    }

    private static int getMax(int firstValue, int secondValue) {
        if (firstValue >= secondValue) {
            return firstValue;
        }
        return secondValue;
    }
    private static char getMax(char firstValue, char secondValue) {
        if (firstValue >= secondValue) {
            return firstValue;
        }
        return secondValue;
    }
    private static String getMax(String firstValue, String secondValue) {
        if (firstValue.compareTo(secondValue) >= 0) {
            return firstValue;
        }
        return secondValue;
    }
}
