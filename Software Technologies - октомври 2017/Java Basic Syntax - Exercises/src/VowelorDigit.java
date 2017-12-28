import java.util.Scanner;

public class VowelorDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String whatIsThis = sc.nextLine().toLowerCase();
        if (whatIsThis.equals("a") || whatIsThis.equals("e") || whatIsThis.equals("o") || whatIsThis.equals("u") || whatIsThis.equals("i")){
            System.out.print("vowel");
        }else if (whatIsThis.equals("0") ||whatIsThis.equals("1") || whatIsThis.equals("2") || whatIsThis.equals("3") || whatIsThis.equals("4") || whatIsThis.equals("5") || whatIsThis.equals("6") || whatIsThis.equals("7") || whatIsThis.equals("8") || whatIsThis.equals("9")){
            System.out.print("digit");
        }else{
            System.out.print("other");
        }
    }
}
