package p_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> passengersInWagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int wagonsMaxCapacity = Integer.parseInt(scanner.nextLine());

        while (true) {
            String[] input = scanner.nextLine().split(" ");

            if (input[0].equals("end")) {
                printFinalStateOfTrain(passengersInWagons);
                break;
            }

            if (input[0].equals("Add")) {
                int numberOfPassengers = Integer.parseInt(input[1]);
                addWagon(passengersInWagons, numberOfPassengers);
            } else {
                int numberOfPassengersToFit = Integer.parseInt(input[0]);
                findWagonToFitPassengers(passengersInWagons, numberOfPassengersToFit, wagonsMaxCapacity);
            }
        }
    }

    private static void printFinalStateOfTrain(List<Integer> passengersInWagons) {
        for (Integer passengersInWagon : passengersInWagons) {
            System.out.print(passengersInWagon + " ");
        }
    }

    private static void findWagonToFitPassengers(List<Integer> passengersInWagons, int numberOfPassengersToFit
    , int wagonsMaxCapacity) {
        for (int i = 0; i < passengersInWagons.size(); i++) {
            if (passengersInWagons.get(i) <= wagonsMaxCapacity - numberOfPassengersToFit) {
                passengersInWagons.set(i, (passengersInWagons.get(i) + numberOfPassengersToFit));
                break;
            }
        }
    }

    private static void addWagon(List<Integer> passengersInWagons, int numberOfPassengers) {
        passengersInWagons.add(numberOfPassengers);
    }
}
