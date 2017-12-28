import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrInt = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        HashMap<Integer, Integer> book = new HashMap<>();

        for (Integer item:arrInt) {
            if (!book.containsKey(item)){
                book.put(item, 0);
            }
            Integer value = book.get(item);
            book.put(item, value + 1);
        }

        int maxCount = 1;
        int bestKey = arrInt[0];

        arrInt = Arrays.stream(arrInt).distinct().toArray();
        for (int number : arrInt) {
            if (maxCount < book.get(number)) {
                maxCount = book.get(number);
                bestKey = number;
            }
        }
        System.out.println(bestKey);
    }
}
