public class PointTester {
    public static void main(String[] args) {

        Point p1 = new Point(2,3);
        Point p2 = new Point(5,8);

        Circle c1 = new Circle(3, p1);

        System.out.println(c1);

        System.out.println(p1.distance(p2));
    }
}
