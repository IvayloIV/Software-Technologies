import java.util.Arrays;
        import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intArr = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(intArr);

        for(int i = 0; i < Math.min(3, intArr.length); i++){
            System.out.print(intArr[intArr.length - i - 1] + " ");
        }
    }
}
