import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrInt = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] arrBomb = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Integer bomb = arrBomb[0];
        Integer rangeBomb = arrBomb[1];

        for (Integer i = 0; i < arrInt.length; i++){
            if (arrInt[i] == bomb){
                Integer startIndex = i - rangeBomb;
                if (startIndex < 0){
                    startIndex = 0;
                }
                Integer endIndex = i + rangeBomb;
                if (endIndex > arrInt.length - 1){
                    endIndex = arrInt.length - 1;
                }

                List<Integer> current = new ArrayList<>();

                for (Integer k = 0; k < arrInt.length; k++){
                    if (k < startIndex || k > endIndex){
                        current.add(arrInt[k]);
                    }
                }
                Integer[] stockArr = new Integer[current.size()];
                stockArr = current.toArray(stockArr);
                arrInt =  Arrays.stream(stockArr).mapToInt(Integer::intValue).toArray();
                i = 0;
            }
        }
        System.out.println(Arrays.stream(arrInt).sum());
    }
}
