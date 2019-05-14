package p_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pokemonsDistanceList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int removedElementSum = 0;

        while (pokemonsDistanceList.size() > 0) {

            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                continue;
            }

            int element = getElement(pokemonsDistanceList, index);
            removedElementSum += element;

            addOrRemoveElementValueFromRemainingElements(pokemonsDistanceList, element);
        }
        System.out.println(removedElementSum);
    }

    public static int getElement(List<Integer> pokemonsDistanceList, int index) {
        int element = 0;

        if (index > pokemonsDistanceList.size() - 1) {
            element = pokemonsDistanceList.get(pokemonsDistanceList.size() - 1);
            pokemonsDistanceList.remove(pokemonsDistanceList.size() - 1);
            pokemonsDistanceList.add(pokemonsDistanceList.get(0));
        } else {
            element = pokemonsDistanceList.get(index);
            pokemonsDistanceList.remove(index);
        }
        return element;
    }

    public static void addOrRemoveElementValueFromRemainingElements(List<Integer> pokemonsDistanceList, int element) {
        for (int i = 0; i < pokemonsDistanceList.size(); i++) {
            int currentElement = pokemonsDistanceList.get(i);

            if (currentElement <= element) {
                pokemonsDistanceList.set(i, currentElement + element);
            } else if (currentElement > element) {
                pokemonsDistanceList.set(i, currentElement - element);
            }
        }
    }
}
