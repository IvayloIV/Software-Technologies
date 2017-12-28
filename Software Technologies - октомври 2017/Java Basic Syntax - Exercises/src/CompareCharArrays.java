import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arrFirst = sc.nextLine().split("\\s+");
        String[] arrSecound = sc.nextLine().split("\\s+");

        for (Integer i = 0; i < Math.min(arrFirst.length, arrSecound.length); i++){
            if (arrFirst[i].charAt(0) < arrSecound[i].charAt(0)){
                System.out.println(String.join("", arrFirst).replace("\\[|\\]", ""));
                System.out.println(String.join("", arrSecound).replace("\\[|\\]", ""));
                return;
            }else if (arrFirst[i].charAt(0) > arrSecound[i].charAt(0)){
                System.out.println(String.join("", arrSecound).replace("\\[|\\]", ""));
                System.out.println(String.join("", arrFirst).replace("\\[|\\]", ""));
                return;
            }
        }

        if (arrFirst.length < arrSecound.length){
            System.out.println(String.join("", arrFirst).replace("\\[|\\]", ""));
            System.out.println(String.join("", arrSecound).replace("\\[|\\]", ""));
        } else{
            System.out.println(String.join("", arrSecound).replace("\\[|\\]", ""));
            System.out.println(String.join("", arrFirst).replace("\\[|\\]", ""));
        }
    }
}
