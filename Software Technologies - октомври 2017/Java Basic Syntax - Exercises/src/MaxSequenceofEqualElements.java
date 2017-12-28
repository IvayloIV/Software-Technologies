import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intArray = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Integer bestStart = 0;
        String bestStartSrting = "";
        Integer bestCurrent = 0;
        String bestCurrentSrting = "";
        for (Integer i = intArray.length - 1; i >= 1; i--){
            if (intArray[i] == intArray[i - 1]){
                bestCurrent++;
                bestCurrentSrting = Integer.toString(intArray[i]);
            }else {
                bestCurrent = 0;
                bestCurrentSrting = "";
            }
            if (bestStart <= bestCurrent){
                bestStart = bestCurrent;
                bestStartSrting = bestCurrentSrting;
            }
        }
        for (Integer i = 0; i < bestStart + 1; i++)
        {
            System.out.print(bestStartSrting + " ");
        }
    }
}
