import java.util.Arrays;
import java.util.Scanner;

public class Max_Sequence_of_Increasing_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] text = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Integer maxSequnce = 0;
        Integer currentSequnce = 1;
        String maxElement = "";
        Integer currentElement = text[0];
        String sq = "" + text[0];
        for (int i = 1; i < text.length; i++) {
            if (currentElement < text[i]){
                currentSequnce++;
                sq += " " + text[i];
            } else {
                currentSequnce = 1;
                sq = "" + text[i];
            }

            if (maxSequnce < currentSequnce) {
                maxSequnce = currentSequnce;
                maxElement = sq;
            }
            currentElement = text[i];
        }
        System.out.printf("%s\n", maxElement);
    }
}
