import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Phonebook_Upgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        TreeMap<String, String> book = new TreeMap<>();
        while (!text.equals("END")){
            String[] tokens = text.split("\\s+");
            if (tokens[0].equals("ListAll")){
                for (Map.Entry<String, String> el : book.entrySet()) {
                    System.out.printf("%s -> %s\n", el.getKey(), el.getValue());
                }
            } else if (tokens[0].equals("A")){
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
