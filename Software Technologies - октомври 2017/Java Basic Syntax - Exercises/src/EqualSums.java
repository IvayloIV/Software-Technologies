import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrInt = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for(Integer i = 0; i < arrInt.length; i++){
            Integer leftPart = Arrays.stream(arrInt).limit(i).sum();
            Integer rightPart = Arrays.stream(arrInt).skip(i + 1).sum();

            if (leftPart.equals(rightPart)){
                System.out.println(i);
                return;
            }
        }
        System.out.print("no");
    }
}
