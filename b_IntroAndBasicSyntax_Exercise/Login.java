package b_IntroAndBasicSyntax_Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";
        int badPassCounter = 0;

        for (int i = userName.length() - 1; i >= 0; i--) {
            password += userName.charAt(i);
        }

        while (true) {
            String passInput = scanner.nextLine();
            if (passInput.equals(password)) {
                System.out.printf("User %s logged in.", userName);
                break;
            } else {
                badPassCounter++;
                if (badPassCounter == 4) {
                    System.out.printf("User %s blocked!", userName);
                    break;
                }
                System.out.println("Incorrect password. Try again.");
            }

        }
    }
}
