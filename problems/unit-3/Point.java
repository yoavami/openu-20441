/**
 * This class represents a Point object in the first quarter of a Cartesian coordinate system.
 *
 * @author Yoav Amit
 * @version 04-13-2023
 */
public class Point {

    private int _x;
    private int _y;
    private final int DEFAULT_VAL = 0;

    /**
     * Default constructor for objects of class Point.
     */
    public Point() {
        _x = 0;
        _y = 0;
    }

    /**
     * Constructor for objects of class Point that takes in two parameters for the x and y coordinates.
     *
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     */
    public Point(int x, int y) {
        _x = Math.max(x, DEFAULT_VAL);
        _y = Math.max(y, DEFAULT_VAL);
    }

    /**
     * Moves the point by dx and dy units in the x and y directions respectively.
     * If the point is moved to a negative coordinate, it is not moved.
     *
     * @param dx the amount to move the point in the x direction
     * @param dy the amount to move the point in the y direction
     */
    public void move(int dx, int dy) {
        if ((_x + dx >= DEFAULT_VAL) && (_y + dy >= DEFAULT_VAL)) {
            _x += dx;
            _y += dy;
        }
    }

    /**
     * Moves the point to the specified x and y coordinates.
     * If the point is moved to a negative coordinate, it is not moved.
     *
     * @param x the x coordinate to move the point to
     * @param y the y coordinate to move the point to
     */
    public void moveTo(int x, int y) {
        if (x >= DEFAULT_VAL && y >= DEFAULT_VAL) {
            _x = x;
            _y = y;
        }
    }

    /**
     * Prints the current coordinates of the point in the format (x,y).
     */
    public void printStatus() {
        System.out.println("(" + _x + ", " + _y + ")");
    }

    public int getX() {
        return _x;
    }

    public int getY() {
        return _y;
    }
} // end of class Point
