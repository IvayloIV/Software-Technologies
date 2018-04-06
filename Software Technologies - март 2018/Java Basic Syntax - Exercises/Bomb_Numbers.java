import java.util.Arrays;
import java.util.Scanner;

public class Bomb_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] bombs = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Integer bomb = bombs[0];
        Integer bombPower = bombs[1];

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0 || num[i] != bomb){
                continue;
            }

            for (int j = Math.max(0, i - bombPower); j <= Math.min(num.length - 1, i + bombPower); j++) {
                num[j] = 0;
            }
        }

        Integer sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);
    }
}
