package u_ObjectsAndClasses_MoreExercise_CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEngines = Integer.parseInt(scanner.nextLine());

        List<Engine> engines = new ArrayList<>();

        for (int i = 0; i < numberOfEngines; i++) {
            String[] engineData = scanner.nextLine().split(" ");

            Engine engine = new Engine(engineData[0], engineData[1], "n/a", "n/a");

            if (engineData.length > 2) {

                try {
                    engine.setDisplacement(String.valueOf(Integer.parseInt(engineData[2])));
                } catch (Exception e) {
                    engine.setEfficiency(engineData[2]);
                }
            }
            if (engineData.length > 3) {
                engine.setEfficiency(engineData[3]);
            }

            engines.add(engine);
        }

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < numberOfCars; i++) {

            String[] carInfo = scanner.nextLine().split(" ");

            String engineModel = carInfo[1];

            Engine engineToAdd = new Engine();

            for (Engine engine : engines) {
                if (engine.getModel().equals(engineModel)) {
                    engineToAdd = engine;
                    break;
                }
            }

            Car car = new Car(carInfo[0], engineToAdd, "n/a", "n/a");

            if (carInfo.length > 2) {
                try {
                    car.setWeight(String.valueOf(Integer.parseInt(carInfo[2])));
                } catch (Exception e) {
                    car.setColor(carInfo[2]);
                }
            }
            if (carInfo.length > 3) {
                car.setColor(carInfo[3]);
            }

            cars.add(car);
        }

        for (Car car : cars) {


            System.out.println(car.getModel() + ":");
            System.out.println("  " + car.getEngine().getModel() + ":");
            System.out.println("    Power: " + car.getEngine().getPower());
            System.out.println("    Displacement: " + car.getEngine().getDisplacement());
            System.out.println("    Efficiency: " + car.getEngine().getEfficiency());
            System.out.println("  Weight: " + car.getWeight());
            System.out.println("  Color: " + car.getColor());
        }
    }
}