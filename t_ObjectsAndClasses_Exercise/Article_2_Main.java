package t_ObjectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Article_2_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Article_2> articles = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(", ");

            Article_2 article = new Article_2(input[0], input[1], input[2]);

            articles.add(article);
        }

        String sortBy = scanner.nextLine().toLowerCase();

        List<Article_2> sortedArticles = new ArrayList<>();

        switch (sortBy) {
            case "title":
                sortedArticles = sortByTitle(articles);
                break;
            case "content":
                sortedArticles = sortByContent(articles);
                break;
            case "author":
                sortedArticles = sortByAuthor(articles);
                break;
        }

        for (Article_2 article : sortedArticles) {
            System.out.printf("%s - %s: %s\n", article.getTitle(), article.getContent()
                    , article.getAuthor());
        }
    }

    private static List<Article_2> sortByAuthor(List<Article_2> articles) {
        List<Article_2> sortedArticles = articles.stream()
                .sorted(Comparator.comparing(Article_2::getAuthor))
                .collect(Collectors.toList());

        return sortedArticles;
    }

    private static List<Article_2> sortByContent(List<Article_2> articles) {
        List<Article_2> sortedArticles = articles.stream()
                .sorted(Comparator.comparing(Article_2::getContent))
                .collect(Collectors.toList());

        return sortedArticles;
    }

    private static List<Article_2> sortByTitle(List<Article_2> articles) {
        List<Article_2> sortedArticles = articles.stream()
                .sorted(Comparator.comparing(Article_2::getTitle))
                .collect(Collectors.toList());

        return sortedArticles;
    }
}
