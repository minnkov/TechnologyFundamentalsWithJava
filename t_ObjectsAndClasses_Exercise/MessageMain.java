package t_ObjectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MessageMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int messageCount = Integer.parseInt(scanner.nextLine());

        //predefined stuff:

        List<Message> messages = new ArrayList<>();

        String[] phrases = {"Excellent product."
                , "Such a great product."
                , "I always use that product."
                , "Best product of its category."
                , "Exceptional product."
                , "I can’t live without this product."};

        String[] events = {"Now I feel good."
                , "I have succeeded with this product."
                , "Makes miracles. I am happy of the results!"
                , "I cannot believe but now I feel awesome."
                , "Try it yourself, I am very satisfied."
                , "I feel great!"};

        String[] authors = {"Diana"
                , "Petya"
                , "Stella"
                , "Elena"
                , "Katya"
                , "Iva"
                , "Annie"
                , "Eva"};

        String[] cities = {"Burgas"
                , "Sofia"
                , "Plovdiv"
                , "Varna"
                , "Ruse"};

        Random rnd = new Random();

        for (int i = 0; i < messageCount; i++) {

            //generate random indexes for each predefined array:

            int randomIndexPhrase = rnd.nextInt(phrases.length);
            int randomIndexEvents = rnd.nextInt(events.length);
            int randomIndexAuthors = rnd.nextInt(authors.length);
            int randomIndexCities = rnd.nextInt(cities.length);

            //get array value at random index:

            String phrase = phrases[randomIndexPhrase];
            String event = events[randomIndexEvents];
            String author = authors[randomIndexAuthors];
            String city = cities[randomIndexCities];

            Message message = new Message(phrase, event, author, city);

            messages.add(message);
        }

        for (Message message : messages) {
            System.out.printf("%s %s %s - %s\n", message.getPhrase(), message.getEvent()
                    , message.getAuthor(), message.getCity());
        }
    }
}
