package p_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        play(firstDeck, secondDeck);

        printWinnerAndSum(firstDeck, secondDeck);
    }

    private static void printWinnerAndSum(List<Integer> firstDeck, List<Integer> secondDeck) {
        int sum = 0;

        if (firstDeck.size() > secondDeck.size()) {
            for (Integer number : firstDeck) {
                sum += number;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (Integer number : secondDeck) {
                sum += number;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }

    private static void play(List<Integer> firstDeck, List<Integer> secondDeck) {

        while (firstDeck.size() > 0 && secondDeck.size() > 0) {

            if (firstDeck.get(0) > secondDeck.get(0)) {
                firstDeck.add(firstDeck.get(0));
                firstDeck.add(secondDeck.get(0));
                firstDeck.remove(0);
                secondDeck.remove(0);
            } else if (secondDeck.get(0) > firstDeck.get(0)) {
                secondDeck.add(secondDeck.get(0));
                secondDeck.add(firstDeck.get(0));
                secondDeck.remove(0);
                firstDeck.remove(0);
            } else if (firstDeck.get(0).equals(secondDeck.get(0))) {
                firstDeck.remove(0);
                secondDeck.remove(0);
            }
        }
    }
}
