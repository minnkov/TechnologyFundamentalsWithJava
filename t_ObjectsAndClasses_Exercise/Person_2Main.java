package t_ObjectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Person_2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person_2> peopleList = new ArrayList<>();

        while (true) {
            String[] input = scanner.nextLine().split(" ");

            if (input[0].equals("End")) {
                printPeopleListSortedByAge(peopleList);
                break;
            }

            Person_2 person = new Person_2(input[0], input[1], Integer.parseInt(input[2]));

            peopleList.add(person);
        }
    }

    private static void printPeopleListSortedByAge(List<Person_2> peopleList) {
        List<Person_2> sortedPeopleList = peopleList.stream()
                .sorted(Comparator.comparingInt(Person_2::getAge))
                .collect(Collectors.toList());

        for (Person_2 person : sortedPeopleList) {
            System.out.printf("%s with ID: %s is %d years old.\n", person.getName()
            , person.getID(), person.getAge());
        }
    }
}
