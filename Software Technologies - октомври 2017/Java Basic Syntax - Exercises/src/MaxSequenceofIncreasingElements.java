import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Integer lenght = 1;
        Integer bestLenght = 1;
        Integer start = 0;
        Integer bestStart = 0;
        for (Integer i = 1; i < intArr.length; i++){
            if (intArr[i] > intArr[i - 1]){
                lenght++;

                if (lenght == 2){
                    start = i - 1;
                }

                if (lenght > bestLenght){
                    bestLenght = lenght;
                    bestStart = start;
                }
            }else{
                lenght = 1;
            }
        }

        for (Integer i = bestStart; i < (bestStart + bestLenght); i++){
            System.out.print(intArr[i] + " ");
        }
    }
}
