import java.util.Scanner;

public class Censor_Email_Address {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        String totalText = sc.nextLine();
        String[] tokens = email.split("@");
        String username = tokens[0];
        String domain = tokens[1];
        String censorUsername = "";
        for (int i = 0; i < username.length(); i++) {
            censorUsername += "*";
        }
        String newEmail = censorUsername + "@" + domain;
        totalText = totalText.replaceAll(email, newEmail);
        System.out.println(totalText);
    }
}
