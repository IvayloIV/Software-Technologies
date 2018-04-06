import java.util.LinkedHashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        LinkedHashMap<String, String> book = new LinkedHashMap<>();
        while (!text.equals("END")){
            String[] tokens = text.split("\\s+");
            if (tokens[0].equals("A")){
                book.put(tokens[1], tokens[2]);
            } else {
                if (book.containsKey(tokens[1])){
                    System.out.printf("%s -> %s\n", tokens[1], book.get(tokens[1]));
                } else {
                    System.out.printf("Contact %s does not exist.\n", tokens[1]);
                }
            }
            text = sc.nextLine();
        }
    }
}
