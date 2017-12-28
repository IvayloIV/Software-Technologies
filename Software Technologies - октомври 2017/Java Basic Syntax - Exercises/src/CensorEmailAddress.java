import java.util.Scanner;

public class CensorEmailAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String email = sc.nextLine();
        String text = sc.nextLine();

        String[] currentEmail = email.split("@");
        String nikname = currentEmail[0];
        String url = currentEmail[1];
        StringBuilder stars = new StringBuilder();
        for (Integer i = 0; i < nikname.length(); i++){
            stars.append("*");
        }
        text = text.replaceAll(email, stars + "@" + url);
        System.out.print(text);
    }
}
