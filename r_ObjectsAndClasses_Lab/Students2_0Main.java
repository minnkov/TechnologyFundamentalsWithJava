package s_ObjectsAndClasses_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2_0Main {
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

            if (doesStudentExist(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHometown(hometown);

            } else {
                Student student = new Student();

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHometown(hometown);

                students.add(student);
            }
        }
        String hometown = scanner.nextLine();

        for (Student student : students) {
            if (student.getHometown().equals(hometown)) {
                System.out.printf("%s %s is %s years old\n", student.getFirstName()
                        , student.getLastName(), student.getAge());
            }
        }
    }

    private static Student getStudent(List<Student> students, String firstName
            , String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName()
                    .equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }

    private static boolean doesStudentExist(List<Student> students, String firstName
            , String lastName) {

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName()
                    .equals(lastName)) {

                return true;
            }
        }
        return false;
    }
}
