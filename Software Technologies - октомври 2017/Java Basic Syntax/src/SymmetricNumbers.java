import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SymmetricNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = Integer.parseInt(sc.nextLine());
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if (i <= 9){
                arr.add(Integer.toString(i));
            }else{
                String firstPart = Integer.toString(i).substring(0, Integer.toString(i).length() / 2);
                String secoundPart = Integer.toString(i).substring((int)Math.ceil(Integer.toString(i).length() / 2D));
                String secound2 = new StringBuffer(secoundPart).reverse().toString();
                if (firstPart.endsWith(secound2)){
                    arr.add(Integer.toString(i));
                }
            }
        }
        String output = arr.stream().collect(Collectors.joining(", "));
        System.out.print(output);
    }
}
