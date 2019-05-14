package t_ObjectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleCatalog = new ArrayList<>();

        while (true) {
            String[] vehicleInfo = scanner.nextLine().split(" ");

            if (vehicleInfo[0].equals("End")) {
                break;
            }

            String type = vehicleInfo[0];
            String model = vehicleInfo[1];
            String color = vehicleInfo[2];
            int horsepower = Integer.parseInt(vehicleInfo[3]);

            Vehicle vehicle = new Vehicle();

            vehicle.setType(type);
            vehicle.setModel(model);
            vehicle.setColor(color);
            vehicle.setHorsepower(horsepower);

            vehicleCatalog.add(vehicle);
        }

        //after "End" command is received:

        while (true) {
            String vehicleModelInput = scanner.nextLine();

            if (vehicleModelInput.equals("Close the Catalogue")) {
                break;
            }

            for (Vehicle vehicle : vehicleCatalog) {
                if (vehicle.getModel().equals(vehicleModelInput)) {
                    String tempType;
                    if (vehicle.getType().equals("car")) {
                        tempType = "Car";
                    } else {
                        tempType = "Truck";
                    }
                    System.out.println("Type: " + tempType);
                    System.out.println("Model: " + vehicle.getModel());
                    System.out.println("Color: " + vehicle.getColor());
                    System.out.println("Horsepower: " + vehicle.getHorsepower());
                }
            }
        }

        double carsTotalHP = 0;
        int carCounter = 0;
        double trucksTotalHP = 0;
        int truckCounter = 0;

        for (Vehicle vehicle : vehicleCatalog) {
            if (vehicle.getType().equals("car")) {
                carsTotalHP += vehicle.getHorsepower();
                carCounter++;
            } else if (vehicle.getType().equals("truck")) {
                trucksTotalHP += vehicle.getHorsepower();
                truckCounter++;
            }
        }

        double carsAvgHP = carsTotalHP / carCounter;
        double trucksAvgHP = trucksTotalHP / truckCounter;

        printCarsAndTrucksAvgHP(carsAvgHP, trucksAvgHP);
    }

    private static void printCarsAndTrucksAvgHP(double carsAvgHP, double trucksAvgHP) {
        System.out.printf("Cars have average horsepower of: %.2f.\n", carsAvgHP);
        System.out.printf("Trucks have average horsepower of: %.2f.\n", trucksAvgHP);
    }
}
