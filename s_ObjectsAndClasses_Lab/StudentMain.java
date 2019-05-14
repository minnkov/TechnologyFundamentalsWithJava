package s_ObjectsAndClasses_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        while (true) {
            String[] input = scanner.nextLine().split(" ");

            if (input[0].equals("end")) {
                break;
            }

            String firstName = input[0];
            String lastName = input[1];
            String age = input[2];
            String hometown = input[3];

            Student student = new Student();

            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setHometown(hometown);

            students.add(student);
        }
        String hometown = scanner.nextLine();

        for (Student student : students) {
            if (student.getHometown().equals(hometown)) {
                System.out.printf("%s %s is %s years old\n", student.getFirstName()
                , student.getLastName(), student.getAge());
            }
        }
    }
}
