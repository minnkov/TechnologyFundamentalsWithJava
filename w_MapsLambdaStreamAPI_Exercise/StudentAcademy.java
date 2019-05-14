package w_MapsLambdaStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!students.containsKey(name)) {
                students.put(name, grade);
            } else {
                double newAvgGrade = (students.get(name) + grade) / 2;
                students.put(name, newAvgGrade);
            }
        }

        students.entrySet().stream()
                .sorted((left, right) -> right.getValue().compareTo(left.getValue()))
                .forEach(e -> {
                    if (e.getValue() >= 4.50) {
                        System.out.printf("%s -> %.2f\n", e.getKey(), e.getValue());
                    }
                });
    }
}
