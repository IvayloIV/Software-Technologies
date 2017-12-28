import java.util.Arrays;
import java.util.Scanner;

public class IntersectionofCircles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] firstCircle = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] secoundCircle = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Point centerC1 = new Point(firstCircle[0], firstCircle[1]);
        Circle c1 = new Circle(centerC1, firstCircle[2]);

        Point centerC2 = new Point(secoundCircle[0], secoundCircle[1]);
        Circle c2 = new Circle(centerC2, secoundCircle[2]);

        boolean isInteresect = intersect(c1, c2);
        System.out.print(isInteresect ? "Yes" : "No");
    }

    public static boolean intersect(Circle c1, Circle c2){
        double lenght = Math.sqrt(Math.pow(c1.getCenter().getX() - c2.getCenter().getX(), 2) +
                Math.pow(c1.getCenter().getY() - c2.getCenter().getY(), 2));
        if (lenght <= c1.getRadius() + c2.getRadius()){
            return true;
        }
        return false;
    }
    public  static  class Point{
        private int x;
        private  int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static  class Circle{
        private Point center;
        private int radius;

        public Circle(Point center, int radius) {
            this.center = center;
            this.radius = radius;
        }

        public Point getCenter() {
            return center;
        }

        public int getRadius() {
            return radius;
        }
    }
}
