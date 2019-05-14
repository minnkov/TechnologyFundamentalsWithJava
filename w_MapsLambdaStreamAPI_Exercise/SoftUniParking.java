package w_MapsLambdaStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");

            String command = input[0];
            String username = input[1];

            if (command.equals("register")) {
                String newLicencePlate = input[2];

                if (!cars.containsKey(username)) {
                    cars.put(username, newLicencePlate);
                    System.out.printf("%s registered %s successfully\n", username, newLicencePlate);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s\n", cars.get(username));
                }

            } else if (command.equals("unregister")) {

                if (cars.containsKey(username)) {
                    cars.remove(username);
                    System.out.printf("%s unregistered successfully\n", username);
                } else {
                    System.out.printf("ERROR: user %s not found\n", username);
                }
            }

        }
        printUsersAndPlates(cars);
    }

    private static void printUsersAndPlates(Map<String, String> cars) {
        String outputPattern = "%s => %s";

        for (Map.Entry<String, String> kvp : cars.entrySet()) {
            System.out.println(String.format(outputPattern, kvp.getKey(), kvp.getValue()));
        }

    }
}
