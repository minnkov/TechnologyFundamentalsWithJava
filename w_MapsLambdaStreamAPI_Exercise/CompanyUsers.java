package w_MapsLambdaStreamAPI_Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> employees= new LinkedHashMap<>();

        while (true) {
            String[] input = scanner.nextLine().split(" -> ");

            if (input[0].equals("End")) {

                employees.entrySet()
                        .stream()
                        .sorted((left, right) -> left.getKey().compareTo(right.getKey()))
                        .forEach(e -> {
                            System.out.println(e.getKey());
                            for (String id : e.getValue()) {
                                System.out.println("-- " + id);
                            }
                        });
                break;
            }

            String companyName = input[0];
            String employeeID = input[1];

            if (!employees.containsKey(companyName)) {

                employees.put(companyName, new ArrayList<>());
                employees.get(companyName).add(employeeID);

            } else {
                if (!employees.get(companyName).contains(employeeID)) {
                    employees.get(companyName).add(employeeID);
                }

            }
        }
    }
}
