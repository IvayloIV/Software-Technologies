import java.util.Scanner;

public class Index_of_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] num = sc.nextLine().toCharArray();
        for (char c : num) {
            System.out.printf("%s -> %d\n", c, Character.getNumericValue(c) - 10);
        }
    }
}
