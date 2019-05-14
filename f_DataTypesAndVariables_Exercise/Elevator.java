package f_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courseCounter = 0;

        while (numberOfPeople > 0) {
            numberOfPeople -= capacity;
            courseCounter++;
        }
        System.out.println(courseCounter);
    }
}
