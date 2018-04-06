import java.util.*;

public class Sums_by_Town {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Double> book = new TreeMap<>();
        Integer n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split("\\|");
            String town = tokens[0].trim();
            Double income = Double.parseDouble(tokens[1]);
            if (!book.containsKey(town)){
                book.put(town, 0.0);
            }
            book.put(town, book.get(town) + income);
        }
        for (Map.Entry<String, Double> currentPair : book.entrySet()) {
            System.out.println(currentPair.getKey() + " -> " + currentPair.getValue());
        }
    }
}
