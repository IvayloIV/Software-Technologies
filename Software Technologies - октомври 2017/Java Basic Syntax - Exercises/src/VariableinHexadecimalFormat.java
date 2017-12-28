import java.util.Scanner;

public class VariableinHexadecimalFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer num = Integer.parseInt(sc.nextLine(), 16);
        System.out.print(num);
    }
}
