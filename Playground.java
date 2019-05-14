
import java.util.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class Playground {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sort = Integer.compare(4, 3);

        String firstWord = "Nasko";
        String secondWord = "Atanas";

        int wordsSort = firstWord.compareTo(secondWord);

        System.out.println(sort);
        System.out.println(wordsSort);
    }
}