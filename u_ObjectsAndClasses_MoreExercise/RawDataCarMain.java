package u_ObjectsAndClasses_MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RawDataCarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split(" ");

            String model = carInfo[0];
            Engine engine = new Engine(Integer.parseInt(carInfo[1])
                    , Integer.parseInt(carInfo[2]));
            Cargo cargo = new Cargo(Integer.parseInt(carInfo[3]), carInfo[4]);
            Tire tire1 = new Tire(Double.parseDouble(carInfo[5])
                    , Integer.parseInt(carInfo[6]));
            Tire tire2 = new Tire(Double.parseDouble(carInfo[7])
                    , Integer.parseInt(carInfo[8]));
            Tire tire3 = new Tire(Double.parseDouble(carInfo[9])
                    , Integer.parseInt(carInfo[10]));
            Tire tire4 = new Tire(Double.parseDouble(carInfo[11])
                    , Integer.parseInt(carInfo[12]));

            Car car = new Car(model, engine, cargo, tire1, tire2, tire3, tire4);

            cars.add(car);
        }

        String command = scanner.nextLine();

        if (command.equals("fragile")) {
            for (Car car : cars) {
                String cargoType = car.getCargo().getCargoType();
                double averageTyrePressure = car.getAverageTirePressure(car.getTires());

                if (cargoType.equals(command) && averageTyrePressure < 1) {
                    System.out.println(car.getModel());
                }
            }
        } else if (command.equals("flamable")) {
            for (Car car : cars) {
                String cargoType = car.getCargo().getCargoType();
                int enginePower = car.getEngine().getEnginePower();

                if (cargoType.equals(command) && enginePower > 250) {
                    System.out.println(car.getModel());
                }
            }
        }
    }
}
