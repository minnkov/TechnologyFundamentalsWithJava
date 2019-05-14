package s_ObjectsAndClasses_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        while (!input.isEmpty()) {
            Random rnd = new Random();
            int randomIndex = rnd.nextInt(input.size());
            System.out.println(input.get(randomIndex));
            input.remove(randomIndex);
        }
    }
}
