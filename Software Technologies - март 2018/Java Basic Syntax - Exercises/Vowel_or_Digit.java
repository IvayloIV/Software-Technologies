import java.util.Scanner;

public class Vowel_or_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String element = sc.nextLine();
        switch (element){
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                System.out.println("digit");
                break;
            case "a":
            case "o":
            case "e":
            case "i":
            case "u":
                System.out.println("vowel");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
