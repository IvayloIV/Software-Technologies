import java.util.Scanner;

public class Sum_N_Integers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(scan.next());
        }
        System.out.printf("Sum = %d", sum);
    }
}
