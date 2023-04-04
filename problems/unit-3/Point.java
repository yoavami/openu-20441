public class Point {

    /**
     * Declarations
     */
    private int _x;
    private int _y;

    /**
     * Constructors
     */
    public Point() {
        _x = 0;
        _y = 0;
    }

    public Point(int x, int y) {
        _x = x;
        _y = y;
    }

    /**
    *Methods
     */
    public void move(int dx, int dy) {
        _x += dx;
        _y += dy;
    }

    public void moveTo(int x, int y) {
        _x = x;
        _y = y;
    }

    public void printStatus() {
        System.out.println("(" + _x + ", " + _y + ")");
    }

    public int getX() {
        return _x;
    }

    public int getY() {
        return _y;
    }
}
