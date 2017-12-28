import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] input = sc.nextLine().toCharArray();
        ReverseArray(input, input.length);
    }

    private static void ReverseArray(char[] input, int length) {
        for(Integer i = length - 1; i >= 0; i--){
            System.out.print(input[i]);
        }
    }
}
