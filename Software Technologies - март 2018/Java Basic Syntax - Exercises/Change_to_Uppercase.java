import java.util.Scanner;

public class Change_to_Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        while (true){
            Integer indexOpen = text.indexOf("<upcase>");
            Integer indexClose = text.indexOf("</upcase>");
            if (indexOpen == -1 || indexClose == -1 || indexOpen > indexClose){
                break;
            }
            String currentStrong = "";
            String replaceText = "";
            for (int i = indexOpen; i <= indexClose + 8; i++) {
                currentStrong += text.charAt(i);
            }
            for (int i = indexOpen + 8; i < indexClose; i++) {
                replaceText += text.charAt(i);
            }
            text = text.replace(currentStrong, replaceText.toUpperCase());
        }
        System.out.println(text);
    }
}
