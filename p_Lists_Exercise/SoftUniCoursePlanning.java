package p_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> courseList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        while(true) {

            String[] command = scanner.nextLine().split(":");

            if (command[0].equals("course start")) {
                printAllCoursesWithNumberAbbreviations(courseList);
                break;
            }
            String lessonTitle;
            String secondLessonTitle;
            int index;

            switch (command[0]) {
                case "Add":
                    lessonTitle = command[1];
                    addLessonToScheduleIfItDoesntExist(courseList, lessonTitle);
                    break;
                case "Insert":
                    lessonTitle = command[1];
                    index = Integer.parseInt(command[2]);
                    insertLessonIfItDoesntExist(courseList, lessonTitle, index);
                    break;
                case "Remove":
                    lessonTitle = command[1];
                    removeLessonIfExists(courseList, lessonTitle);
                    break;
                case "Swap":
                    lessonTitle = command[1];
                    secondLessonTitle = command[2];
                    swapLessonsIfTheyExist(courseList, lessonTitle, secondLessonTitle);
                    break;
                case "Exercise":
                    lessonTitle = command[1];
                    addExercise(courseList, lessonTitle);
                    break;
            }
        }
    }

    private static void printAllCoursesWithNumberAbbreviations(List<String> courseList) {
        int counter = 1;
        for (String course : courseList) {
            System.out.printf("%d.%s\n", counter, course);
            counter++;
        }
    }

    private static void addExercise(List<String> courseList, String lessonTitle) {

        String lessonAndExercise = lessonTitle + "-" + "Exercise";

        if (courseList.contains(lessonTitle) && !courseList.contains(lessonAndExercise)) {
            int lessonIndex = courseList.indexOf(lessonTitle);
            courseList.add(lessonIndex + 1, lessonAndExercise);
        } else if (!courseList.contains(lessonTitle)) {
            courseList.add(lessonTitle);
            courseList.add(lessonAndExercise);
        }
    }

    private static void swapLessonsIfTheyExist(List<String> courseList, String lessonTitle, String secondLessonTitle) {

        String lessonAndExercise = lessonTitle + "-" + "Exercise";
        String secondLessonAndExercise = secondLessonTitle + "-" + "Exercise";

        if (courseList.contains(lessonTitle) && courseList.contains(secondLessonTitle)) {
            int firstLessonIndex = courseList.indexOf(lessonTitle);
            int secondLessonIndex = courseList.indexOf(secondLessonTitle);
            String temp = lessonTitle;
            courseList.set(firstLessonIndex, secondLessonTitle);
            courseList.set(secondLessonIndex, temp);
            if (courseList.contains(lessonAndExercise) && courseList.contains(secondLessonAndExercise)) {
                int firstExerciseIndex = courseList.indexOf(lessonAndExercise);
                int secondExerciseIndex = courseList.indexOf(secondLessonAndExercise);
                String tempExercise = lessonAndExercise;
                courseList.set(firstExerciseIndex, secondLessonAndExercise);
                courseList.set(secondExerciseIndex, tempExercise);
            } else if (courseList.contains(lessonAndExercise)) {
                courseList.remove(lessonAndExercise);
                courseList.add(secondLessonIndex + 1 ,lessonAndExercise);
            } else if (courseList.contains(secondLessonAndExercise)) {
                courseList.remove(secondLessonAndExercise);
                courseList.add(firstLessonIndex + 1, secondLessonAndExercise);
            }
        }
    }

    private static void removeLessonIfExists(List<String> courseList, String lessonTitle) {

        String lessonAndExercise = lessonTitle + "-" + "Exercise";

        if (courseList.contains(lessonTitle)) {
            courseList.remove(lessonTitle);
        }
        if (courseList.contains(lessonAndExercise)) {
            courseList.remove(lessonAndExercise);
        }
    }

    private static void insertLessonIfItDoesntExist(List<String> courseList, String lessonTitle, int index) {
        if (!courseList.contains(lessonTitle) && index >= 0 && index < courseList.size()) {
            courseList.add(index, lessonTitle);
        }
    }

    private static void addLessonToScheduleIfItDoesntExist(List<String> courseList, String lessonTitle) {
        if (!courseList.contains(lessonTitle)) {
            courseList.add(lessonTitle);
        }
    }
}
