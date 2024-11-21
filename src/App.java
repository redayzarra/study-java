
import java.awt.Point;


public class App {
    public static void main(String[] args) {
        // Primitive types don't point to each other
        int x = 1;
        int y = x;
        x = 2;
        // The variables are independent
        System.out.println(y);

        // Reference types point to same object
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 5;
        // The variables are dependent
        System.out.println(point2);
    }
}
