package u_ObjectsAndClasses_MoreExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Employee> employees = new ArrayList<>();
        List<Department> departments = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] employeeInfo = scanner.nextLine().split(" ");

            String name = employeeInfo[0];
            double salary = Double.parseDouble(employeeInfo[1]);
            String position = employeeInfo[2];
            String department = employeeInfo[3];
            String email = "n/a";
            int age = -1;

            if (employeeInfo.length >= 5) {
                try {
                    age = Integer.parseInt(employeeInfo[4]);
                } catch (Exception e) {
                    email = employeeInfo[4];
                }
            }
            if (employeeInfo.length >= 6) {
                age = Integer.parseInt(employeeInfo[5]);
            }

            boolean departmentAlreadyExists = false;

            Department departmentToAdd = new Department();

            for (Department department1 : departments) {
                if (department1.getDepartmentName().equals(department)) {
                    int departmentCounter = department1.getDepartmentCounter();
                    double salaryTemp = department1.getTotalSalary();
                    department1.setTotalSalary(salaryTemp + salary);
                    department1.setDepartmentCounter(departmentCounter + 1);
                    departmentAlreadyExists = true;
                    break;
                }
            }

            if (!departmentAlreadyExists) {
                departmentToAdd.setDepartmentName(department);
                departmentToAdd.setTotalSalary(salary);
                departmentToAdd.setDepartmentCounter(1);
                departments.add(departmentToAdd);
            }

            Employee employee = new Employee();

            employee.setName(name);
            employee.setSalary(salary);
            employee.setPosition(position);
            employee.setDepartment(department);
            employee.setEmail(email);
            employee.setAge(age);

            employees.add(employee);
        }

        String deptWithHighestAverage = getDepartmentWithHighestAvgSalary(departments);

        System.out.println("Highest Average Salary: " + deptWithHighestAverage);

        List<Employee> employeesSorted = sortEmployeesDecendingSalary(employees);

        for (Employee employee : employeesSorted) {
            if (employee.getDepartment().equals(deptWithHighestAverage)) {
                System.out.printf("%s %.2f %s %d\n", employee.getName()
                , employee.getSalary(), employee.getEmail(), employee.getAge());
            }
        }
    }

    public static String getDepartmentWithHighestAvgSalary(List<Department> departments) {
        double highestAveragePerDept = Integer.MIN_VALUE;
        String deptWithHighestAverage = " ";

        for (Department department : departments) {
            double average = department.getTotalSalary() / department.getDepartmentCounter();
            String deptTemp = department.getDepartmentName();
            if (average > highestAveragePerDept) {
                highestAveragePerDept = average;
                deptWithHighestAverage = deptTemp;
            }
        }
        return deptWithHighestAverage;
    }

    private static List<Employee> sortEmployeesDecendingSalary(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());
    }
}
