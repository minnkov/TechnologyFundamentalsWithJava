package b_IntroAndBasicSyntax_Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());


        int freeBeltCounter = studentCount / 6;
        double totalLightsaberPrice = Math.ceil(studentCount * 1.10) * lightsaberPrice;
        double totalRobePrice = studentCount * robePrice;
        double totalBeltPrice = (studentCount - freeBeltCounter) * beltPrice;

        double totalPrice = totalBeltPrice + totalLightsaberPrice + totalRobePrice;

        if (money >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", (totalPrice - money));
        }
    }
}
