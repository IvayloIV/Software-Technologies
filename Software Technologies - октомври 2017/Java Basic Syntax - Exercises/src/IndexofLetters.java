import java.util.Scanner;

public class IndexofLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arrCh = sc.nextLine().toLowerCase().toCharArray();

        for (Character letter:arrCh) {
            Integer currentInt = (int)letter - 97;
            System.out.println(letter + " -> " + currentInt);
        }
    }
}
