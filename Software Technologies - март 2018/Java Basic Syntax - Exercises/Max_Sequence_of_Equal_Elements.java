import java.util.Scanner;

public class Max_Sequence_of_Equal_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] text = sc.nextLine().split("\\s+");
        Integer maxSequnce = 0;
        Integer currentSequnce = 1;
        String maxElement = "";
        String currentElement = text[0];
        for (int i = 1; i < text.length; i++) {
            if (currentElement.equals(text[i])){
                currentSequnce++;
            } else {
                currentSequnce = 1;
                currentElement = text[i];
            }

            if (maxSequnce < currentSequnce) {
                maxSequnce = currentSequnce;
                maxElement = currentElement;
            }
        }

        for (int i = 0; i < maxSequnce; i++) {
            System.out.print(maxElement + " ");
        }
    }
}
