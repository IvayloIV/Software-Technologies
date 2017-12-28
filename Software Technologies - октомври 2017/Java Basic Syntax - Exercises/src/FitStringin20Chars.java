import java.util.Scanner;

public class FitStringin20Chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] sentance = sc.nextLine().toCharArray();

        for (Integer i = 0; i < 20; i++){
            if (i < sentance.length){
                System.out.print(sentance[i]);
            }
            else{
                System.out.print('*');
            }
        }
    }
}
