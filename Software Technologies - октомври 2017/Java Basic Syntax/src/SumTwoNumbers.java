import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = Double.parseDouble(sc.nextLine());
        double num2 = Double.parseDouble(sc.nextLine());

        System.out.print(num1 + num2);
    }
}
