import java.util.Scanner;

public class Fit_String_in_20_Chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        for (int i = 0; i < 20; i++) {
            if (text.length() - 1 >= i) {
                System.out.printf("%s", text.charAt(i));
            } else {
                System.out.printf("*");
            }
        }
    }
}
