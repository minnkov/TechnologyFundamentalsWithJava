package a_IntroAndBasicSyntax_Lab;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticketPrice = 0;

        switch (typeOfDay) {
            case "Weekday":
                if (age >= 0 && age <= 18){
                    ticketPrice = 12;
                } else if (age > 18 && age <= 64){
                    ticketPrice = 18;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 12;
                } else {
                    System.out.println("Error!");
                    break;
                }
                System.out.println(ticketPrice + "$");
                break;
            case "Weekend":
                if (age >= 0 && age <= 18){
                    ticketPrice = 15;
                } else if (age > 18 && age <= 64){
                    ticketPrice = 20;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 15;
                } else {
                    System.out.println("Error!");
                    break;
                }
                System.out.println(ticketPrice + "$");
                break;
            case "Holiday":
                if (age >= 0 && age <= 18){
                    ticketPrice = 5;
                } else if (age > 18 && age <= 64){
                    ticketPrice = 12;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 10;
                } else {
                    System.out.println("Error!");
                    break;
                }
                System.out.println(ticketPrice + "$");
                break;
        }

    }
}
