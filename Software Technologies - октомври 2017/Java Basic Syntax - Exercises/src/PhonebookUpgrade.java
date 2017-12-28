import java.util.HashMap;
import java.util.Scanner;

public class PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> book = new HashMap<>();
        while (true){
            String[] input = sc.nextLine().split("\\s+");
            if (input[0].equals("END")){
                break;
            }
            String classa = input[0];

            if (classa.equals("A")){
                book.put(input[1], input[2]);
            }else if (classa.equals("S")){
                if (book.containsKey(input[1])){
                    System.out.println(input[1] + " -> " + book.get(input[1]));
                }else{
                    System.out.println("Contact " + input[1] + " does not exist.");
                }
            }else if (classa.equals("ListAll")){
                book.entrySet().stream().sorted((pair1, pair2) -> pair1.getKey().compareTo(pair2.getKey())).forEach((pair1) -> {
                    System.out.println(pair1.getKey() + " -> " + pair1.getValue());
                });
            }
        }
    }
}
