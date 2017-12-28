import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChangetoUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder input = new StringBuilder(sc.nextLine());

        while (true){
            Integer startIndex = input.indexOf("<upcase>");
            if (startIndex == -1){
                break;
            }
            Integer endIndex = input.indexOf("</upcase>");

            List<Character> current = new ArrayList<>();
            char[] currentArray = input.toString().toCharArray();

            for (Integer i = 0; i < currentArray.length; i++){
                if (i >= startIndex && i < startIndex + 8){
                    continue;
                }else if (i >= endIndex && i < endIndex + 9){
                    continue;
                }else if (i > startIndex + 7 && i < endIndex){
                    current.add(Character.toUpperCase(currentArray[i]));
                }else{
                    current.add(currentArray[i]);
                }
            }
            input = new StringBuilder();
            for (Integer i = 0; i < current.size(); i++){
                input.append(current.get(i));
            }
        }
        System.out.print(input);
    }
}
