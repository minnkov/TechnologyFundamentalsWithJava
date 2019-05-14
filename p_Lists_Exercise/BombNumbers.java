package p_Lists_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] bombNumberAndPower = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bombNumber = bombNumberAndPower[0];
        int power = bombNumberAndPower[1];

        List<Integer> bombNumbersIndexes = new ArrayList<>();

        int bombNumbersCount = 0;

        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) == bombNumber) {
                bombNumbersIndexes.add(i);
                bombNumbersCount++;
            }
        }

        List<Integer> indexesOfNumbersToRemove = getIndexesOfAllNumbersToRemove(numbersList
                , bombNumbersIndexes
                , bombNumbersCount, power, bombNumber);

        for (int i = 0; i < indexesOfNumbersToRemove.size(); i++) {
            if (indexesOfNumbersToRemove.get(i) < 0
                    || indexesOfNumbersToRemove.get(i) >= numbersList.size()) {
                indexesOfNumbersToRemove.remove(i);
            }
        }

        detonateNumbers(numbersList, indexesOfNumbersToRemove);

        printSumOfRemainingNumbers(numbersList);
    }

    private static void detonateNumbers(List<Integer> numbersList, List<Integer> indexesOfNumbersToRemove) {

        for (int i = 0; i < indexesOfNumbersToRemove.size(); i++) {
            numbersList.set(indexesOfNumbersToRemove.get(i), 0);
        }
    }

    private static List<Integer> getIndexesOfAllNumbersToRemove(List<Integer> numbersList
            , List<Integer> bombNumbersIndexes
            , int bombNumbersCount, int power, int bombNumber) {

        List<Integer> indexesOfNumbersToRemove = new ArrayList<>();

        for (int j = 0; j <= bombNumbersCount; j++) {
            for (int i = 0; i <= power * 2; i++) {

                if (bombNumbersIndexes.get(j) - power + i >= 0
                        && bombNumbersIndexes.get(j) - power + i < numbersList.size()) {

                    indexesOfNumbersToRemove.add(bombNumbersIndexes.get(j) - power + i);

                    if (numbersList.get(bombNumbersIndexes.get(j) - power + i) == bombNumber) {
                        bombNumbersCount--;
                    }
                }
            }
        }

        return indexesOfNumbersToRemove;
    }

    private static void printSumOfRemainingNumbers(List<Integer> numbersList) {
        int sum = 0;

        for (Integer number : numbersList) {
            sum += number;
        }

        System.out.println(sum);
    }
}
