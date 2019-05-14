package v_MapsLambdaStreamAPI_Lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //option 1

//        List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
//                .map(e -> Integer.parseInt(e))
//                .sorted(Comparator.reverseOrder())
//                .limit(3)
//                .collect(Collectors.toList());

        //option 2

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((a, b) -> b.compareTo(a))
                .limit(3)
                .forEach(e -> System.out.print(e + " "));

//        for (Integer num : input) {
//            System.out.print(num + " ");
//        }
    }
}
