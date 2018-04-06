import java.util.Scanner;

public class URL_Parser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int indexOfProt = text.indexOf("://");
        String newText = text;
        if (indexOfProt == -1){
            System.out.printf("[protocol] = \"\"\n");
        } else {
            String prot = "";
            for (int i = 0; i < indexOfProt; i++) {
                prot += text.charAt(i);
            }
            newText = "";
            for (int i = indexOfProt + 3; i < text.length(); i++) {
                newText += text.charAt(i);
            }
            System.out.printf("[protocol] = \"%s\"\n", prot);
        }

        Integer resource = newText.indexOf('/');

        if (resource == -1){
            System.out.printf("[server] = \"%s\"\n", newText);
            System.out.printf("[resource] = \"\"\n");
        } else {
            String prot = "";
            for (int i = resource + 1; i < newText.length(); i++) {
                prot += newText.charAt(i);
            }
            String helper = newText;
            newText = "";
            for (int i = 0; i < Math.min(helper.length() - 1 - prot.length(), helper.length()); i++) {
                newText += helper.charAt(i);
            }
            System.out.printf("[server] = \"%s\"\n", newText);
            System.out.printf("[resource] = \"%s\"\n", prot);
        }
    }
}
