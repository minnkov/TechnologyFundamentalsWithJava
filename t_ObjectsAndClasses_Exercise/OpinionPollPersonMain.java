package t_ObjectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OpinionPollPersonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);

            people.add(person);
        }

        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());

        for (Person person : sortedPeople) {
            if (person.getAge() > 30) {
                System.out.printf("%s - %d\n", person.getName(), person.getAge());
            }
        }
    }

}

