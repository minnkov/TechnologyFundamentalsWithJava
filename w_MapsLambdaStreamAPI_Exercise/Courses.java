package w_MapsLambdaStreamAPI_Exercise;

import java.util.*;
import static java.util.stream.Collectors.toMap;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (true) {

            String[] input = scanner.nextLine().split(" : ");

            if (input[0].equals("end")) {
                printCoursesAndStudents(courses);
                break;
            }

            String courseName = input[0];
            String studentName = input[1];

            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
                courses.get(courseName).add(studentName);
            } else {
                courses.get(courseName).add(studentName);
            }
        }
    }

    private static void printCoursesAndStudents(Map<String, List<String>> courses) {

        //sort by students count (list.size)

        Map<String, List<String>> sortedCourses = courses.entrySet()
                .stream()
                .sorted((left, right) ->
                        Integer.compare(right.getValue().size(), left.getValue().size()))
                .collect(toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a,b) -> {throw new AssertionError();},
                        LinkedHashMap::new
                ));

        String outputPattern = "%s: %d";

        for (Map.Entry<String, List<String>> kvp : sortedCourses.entrySet()) {
            Collections.sort(kvp.getValue());
            System.out.println(String.format(outputPattern, kvp.getKey(), kvp.getValue().size()));

            for (String student : kvp.getValue()) {
                System.out.printf("-- %s\n", student);
            }
        }
    }
}
