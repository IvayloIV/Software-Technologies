import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class SumsbyTown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = Integer.parseInt(sc.nextLine());
        TreeMap<String, Double> book = new TreeMap<>();

        for (int i = 0; i < n; i++){
            String[] arr = sc.nextLine().split("\\|");
            String town = arr[0].trim();
            double totalIncome = Double.parseDouble(arr[1].trim());

            if (!book.containsKey(town)){
                book.put(town, totalIncome);
            }
            else {
                book.put(town, book.get(town) + totalIncome);
            }
        }
        for (String key : book.keySet()) {
            System.out.println(key + " -> " + book.get(key));
        }
    }
}
