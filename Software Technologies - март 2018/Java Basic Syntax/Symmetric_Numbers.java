import java.util.Scanner;

public class Symmetric_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());

        for (int i = 1; i <= n; i++) {
            if (isSymmetric(i)){
                System.out.printf("%d ", i);
            }
        }
    }
    private static boolean isSymmetric(int num){
        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length() / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(numStr.length() - 1 - i)){
                return  false;
            }
        }
        return true;
    }
}
