import java.util.Scanner;

public class Compare_Char_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] text1 = sc.nextLine().split("\\s+");
        String[] text2 = sc.nextLine().split("\\s+");
        for (int i = 0; i < Math.min(text1.length, text2.length); i++) {
            if (text1[i].charAt(0) < text2[i].charAt(0)){
                printResult(text1, text2);
                return;
            } else if (text1[i].charAt(0) > text2[i].charAt(0)){
                printResult(text2, text1);
                return;
            }
        }
        if (text1.length > text2.length){
            printResult(text2, text1);
        } else {
            printResult(text1, text2);
        }
    }
    public static void printResult(String[] text1, String[] text2){
        System.out.println(String.join("", text1).replaceAll("\\[|]", ""));
        System.out.println(String.join("", text2).replaceAll("\\[|]", ""));
    }
}
