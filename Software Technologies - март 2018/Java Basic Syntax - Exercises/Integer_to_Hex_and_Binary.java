import java.util.Scanner;

public class Integer_to_Hex_and_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int text = Integer.parseInt(sc.nextLine());
        System.out.println(Integer.toHexString(text).toUpperCase());
        System.out.println(Integer.toBinaryString(text));
    }
}
