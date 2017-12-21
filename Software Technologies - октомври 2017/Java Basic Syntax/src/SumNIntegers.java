import java.util.ArrayList;
import java.util.Scanner;

public class SumNIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Integer currentNum = Integer.parseInt(sc.nextLine());
            arr.add(currentNum);
        }
        System.out.print("Sum = " + arr.stream().mapToInt(d -> d).sum());
    }
}
