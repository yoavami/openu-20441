public class PointTester {
    public static void main(String[] args) {

        Point p1 = new Point(1, 2);
        p1.printStatus();
        p1.move(2, 3);
        p1.printStatus();
        p1.moveTo(10, 40);
        p1.printStatus();
        p1.moveTo(-10, -50);
        p1.printStatus();
    }
}
