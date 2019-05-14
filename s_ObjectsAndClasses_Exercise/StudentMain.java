package t_ObjectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] studentInfo = scanner.nextLine().split(" ");

            String firstName = studentInfo[0];
            String lastName = studentInfo[1];
            double grade = Double.parseDouble(studentInfo[2]);

            Student student = new Student();

            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setGrade(grade);

            students.add(student);
        }

        //sort students by grade

        List<Student> studentsSorted = students.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade)
                .reversed())
                .collect(Collectors.toList());

        for (Student student : studentsSorted) {
            System.out.printf("%s %s: %.2f\n", student.getFirstName()
            , student.getLastName(), student.getGrade());
        }
    }
}
