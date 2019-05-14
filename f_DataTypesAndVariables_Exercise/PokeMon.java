package f_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int initialPokePower = pokePower;
        int distanceBetweenTargets = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int pokeCounter = 0;


        // n - m until n < m
        while (pokePower >= distanceBetweenTargets) {
            pokePower -= distanceBetweenTargets;

            if (pokePower == initialPokePower * 0.5) {
                if (exhaustionFactor > 0) {
                    pokePower /= exhaustionFactor;
                }
            }
            pokeCounter++;
        }
        System.out.println(pokePower);
        System.out.println(pokeCounter);
    }
}
