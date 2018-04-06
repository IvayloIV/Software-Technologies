import java.util.Scanner;

public class Reverse_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "";
        for (int i = 0; i < 3; i++) {
            text = sc.nextLine() + text;
        }
        System.out.print(text);
    }
}
