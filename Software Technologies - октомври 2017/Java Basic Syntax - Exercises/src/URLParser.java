import java.util.Scanner;

public class URLParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] sentenceP = sentence.split("://");
        String servers = "";
        if (sentenceP.length < 2){
            System.out.println("[protocol] = \"\"");
            servers = sentenceP[0];
        }
        else{
            System.out.println("[protocol] = \"" + sentenceP[0] + "\"");
            servers = sentenceP[1];
        }

        String[] sentenceE = servers.split("/");

        System.out.println("[server] = \"" + sentenceE[0] + "\"");
        if (sentenceE.length < 2){
            System.out.print("[resource] = \"\"");
        }else{
            System.out.print("[resource] = \"");
            for (Integer i = 1; i < sentenceE.length; i++){
                System.out.print(sentenceE[i]);
                if (i != sentenceE.length - 1){
                    System.out.print("/");
                }
            }
            System.out.print("\"");
        }
    }
}
