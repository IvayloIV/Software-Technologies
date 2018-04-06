import java.util.Arrays;
import java.util.Scanner;

public class Equal_Sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < num.length; i++) {
            Integer leftPart = 0;
            Integer rightPart = 0;
            for (int j = 0; j < i; j++) {
                leftPart += num[j];
            }
            for (int j = i + 1; j < num.length; j++) {
                rightPart += num[j];
            }
            if (leftPart.equals(rightPart)){
                System.out.printf("%d\n", i);
                return;
            }
        }
        System.out.printf("no\n");
    }
}
