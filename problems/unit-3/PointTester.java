public class PointTester {
    public static void main(String[] args) {

        Point p1 = new Point(2,3);
        Point p2 = new Point(2, 3);
        System.out.println(p1.isAbove(p2));
        System.out.println(p1.isUnder(p2));
        System.out.println(p2.isAbove(p1));
        System.out.println(p2.isUnder(p1));
    }
}
