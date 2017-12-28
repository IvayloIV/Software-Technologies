import java.util.Scanner;

public class BooleanVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Boolean is = sc.nextBoolean();
        System.out.print(is ? "Yes" : "No");

    }
}
