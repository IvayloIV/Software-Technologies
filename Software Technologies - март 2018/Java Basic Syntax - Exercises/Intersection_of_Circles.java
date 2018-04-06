import java.util.Arrays;
import java.util.Scanner;

public class Intersection_of_Circles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] firstCircle = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] secoundCircle = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Circle firstCircleReal = new Circle(new Points(firstCircle[0], firstCircle[1]), firstCircle[2]);
        Circle secondCircleReal = new Circle(new Points(secoundCircle[0], secoundCircle[1]), secoundCircle[2]);
        Boolean isValid = Intersect(firstCircleReal, secondCircleReal);
        System.out.println(isValid ? "Yes" : "No");
    }

    public static boolean Intersect(Circle c1, Circle c2){
        double x = Math.pow(c1.getCenter().getX() - c2.getCenter().getX(), 2);
        double y = Math.pow(c1.getCenter().getY() - c2.getCenter().getY(), 2);
        double length = Math.sqrt(x + y);
        if (length <= c1.getRadius() + c2.getRadius()){
            return true;
        }
        return  false;
    }

    public static class Points {
        private int X;
        private int Y;

        public Points(int x, int y) {
            X = x;
            Y = y;
        }

        public int getX() {
            return X;
        }

        public int getY() {
            return Y;
        }
    }

    public static class Circle {
        private Points center;
        private int radius;

        public Circle(Points center, int radius) {
            this.center = center;
            this.radius = radius;
        }

        public Points getCenter() {
            return center;
        }

        public int getRadius() {
            return radius;
        }
    }
}
