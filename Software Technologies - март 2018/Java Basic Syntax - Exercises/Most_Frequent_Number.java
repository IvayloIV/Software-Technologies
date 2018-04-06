import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Most_Frequent_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String allNumsStr = "";
        int maxCount = 0;
        int maxNum = 0;

        for (int i = 0; i < num.length; i++) {
            if (allNumsStr.contains(Integer.toString(num[i]))){
                continue;
            }
            allNumsStr += Integer.toString(num[i]);
            int count = 1;
            for (int j = 0; j < num.length; j++) {
                if (i != j && num[i] == num[j]){
                    count++;
                }
            }
            if (maxCount < count){
                maxCount = count;
                maxNum = num[i];
            }
        }
        System.out.println(maxNum);
    }
}
