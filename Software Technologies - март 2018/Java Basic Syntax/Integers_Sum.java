import java.util.Scanner;

public class Integers_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (!isEqual(num1, num2, num3) && !isEqual(num2, num3, num1) && !isEqual(num3, num1, num2)){
            System.out.println("No");
        }
    }
    private static boolean isEqual(int num1, int num2, int num3){
        if (num1 + num2 != num3){
            return false;
        }
        if (num1 <= num2){
            System.out.printf("%d + %d = %d", num1, num2, num3);
        } else {
            System.out.printf("%d + %d = %d", num2, num1, num3);
        }
        return true;
    }
}
