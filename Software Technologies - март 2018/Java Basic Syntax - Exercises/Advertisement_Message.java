import java.util.Random;
import java.util.Scanner;

public class Advertisement_Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Random randomN = new Random();
            System.out.println(GeneratePhrases(randomN) + " " + GenerateEvents(randomN) + " " + GenerateAuthor(randomN) + " - " + GenerateCities(randomN));
        }
    }

    private static String GenerateCities(Random k) {
        String[] cities    = {
                "Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"
        };
        return cities[k.nextInt(cities.length)];
    }

    private static String GenerateAuthor(Random k) {
        String[] author   = {
                "Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"
        };
        return author[k.nextInt(author.length)];
    }

    private static String GenerateEvents(Random k) {
        String[] events  = {
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        };
        return events[k.nextInt(events.length)];
    }

    private static String GeneratePhrases(Random k) {
        String[] phrases = {
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can't live without this product."
        };
        return phrases[k.nextInt(phrases.length)];
    }
}
