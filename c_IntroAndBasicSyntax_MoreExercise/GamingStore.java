package c_IntroAndBasicSyntax_MoreExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        double initialBalance = currentBalance;

        petio:
        while (true) {
            String gameTitle = scanner.nextLine();
            if (gameTitle.equals("Game Time")) {
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f", (initialBalance - currentBalance), currentBalance);
                break;
            }

            switch (gameTitle) {
                case "OutFall 4":
                    currentBalance -= 39.99;
                    if (currentBalance < 0) {
                        System.out.println("Too Expensive");
                        currentBalance += 39.99;
                    } else {
                        System.out.println("Bought " + gameTitle);
                    }
                    if (currentBalance == 0) {
                        System.out.println("Out of money!");
                        break petio;
                    }
                    break;
                case "CS: OG":
                    currentBalance -= 15.99;
                    if (currentBalance < 0) {
                        System.out.println("Too Expensive");
                        currentBalance += 15.99;
                    } else {
                        System.out.println("Bought " + gameTitle);
                    }
                    if (currentBalance == 0) {
                        System.out.println("Out of money!");
                        break petio;
                    }
                    break;
                case "Zplinter Zell":
                    currentBalance -= 19.99;
                    if (currentBalance < 0) {
                        System.out.println("Too Expensive");
                        currentBalance += 19.99;
                    } else {
                        System.out.println("Bought " + gameTitle);
                    }
                    if (currentBalance == 0) {
                        System.out.println("Out of money!");
                        break petio;
                    }
                    break;
                case "Honored 2":
                    currentBalance -= 59.99;
                    if (currentBalance < 0) {
                        System.out.println("Too Expensive");
                        currentBalance += 59.99;
                    } else {
                        System.out.println("Bought " + gameTitle);
                    }
                    if (currentBalance == 0) {
                        System.out.println("Out of money!");
                        break petio;
                    }
                    break;
                case "RoverWatch":
                    currentBalance -= 29.99;
                    if (currentBalance < 0) {
                        System.out.println("Too Expensive");
                        currentBalance += 29.99;
                    } else {
                        System.out.println("Bought " + gameTitle);
                    }
                    if (currentBalance == 0) {
                        System.out.println("Out of money!");
                        break petio;
                    }
                    break;
                case "RoverWatch Origins Edition":
                    currentBalance -= 39.99;
                    if (currentBalance < 0) {
                        System.out.println("Too Expensive");
                        currentBalance += 39.99;
                    } else {
                        System.out.println("Bought " + gameTitle);
                    }
                    if (currentBalance == 0) {
                        System.out.println("Out of money!");
                        break petio;
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
        }
    }
}
