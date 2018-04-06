import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Largest_3_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intArr = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(intArr);
        for (int i = 0; i < Math.min(3, intArr.length); i++) {
            System.out.printf("%d\n", intArr[intArr.length - 1 - i]);
        }
    }
}
