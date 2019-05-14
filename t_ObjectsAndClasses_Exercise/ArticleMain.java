package t_ObjectsAndClasses_Exercise;

import java.util.Scanner;

public class ArticleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        Article article = new Article(input[0], input[1], input[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(": ");

            switch (command[0]) {
                case "Edit":
                    article.editContent(command[1]);
                    break;
                case "Rename":
                    article.renameTitle(command[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(command[1]);
                    break;
            }
        }
        System.out.printf("%s - %s: %s", article.getTitle(), article.getContent()
        , article.getAuthor());
    }
}
