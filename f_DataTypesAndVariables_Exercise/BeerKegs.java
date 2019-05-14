package f_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String biggestKegModel = "swag";
        double biggestKeg = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double kegVolume = Math.PI * radius * radius * height;
            if (kegVolume > biggestKeg) {
                biggestKeg = kegVolume;
                biggestKegModel = kegModel;
            }
        }
        System.out.println(biggestKegModel);
    }
}
