package p_Lists_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        List<String> guestsList = new ArrayList<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String[] command = scanner.nextLine().split(" ");

            String name = command[0];

            switch (command[2]) {
                case "going!":
                    checkIfNameIsInTheListAndAddIfNot(guestsList, name);
                    break;
                case "not":
                    checkIfNameIsInTheListAndRemoveIfTrue(guestsList, name);
                    break;
            }
        }
        printAllGuests(guestsList);
    }

    private static void printAllGuests(List<String> guestsList) {
        for (String guest : guestsList) {
            System.out.println(guest);
        }
    }

    private static void checkIfNameIsInTheListAndRemoveIfTrue(List<String> guestsList, String name) {

        boolean isInList = false;
        for (int i = 0; i < guestsList.size(); i++) {
            if (guestsList.get(i).equals(name)) {
                guestsList.remove(i);
                isInList = true;
                break;
            }
        }

        if (!isInList) {
            System.out.println(name + " is not in the list!");
        }
    }

    private static void checkIfNameIsInTheListAndAddIfNot(List<String> guestsList, String name) {
        boolean isInList = false;

        for (String guest : guestsList) {
            if (guest.equals(name)) {
                isInList = true;
                break;
            }
        }

        if (isInList) {
            System.out.println(name + " is already in the list!");
        } else {
            guestsList.add(name);
        }
    }
}
