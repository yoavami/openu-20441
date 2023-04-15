/**
 * This class represents a Point object in the first quarter of a Cartesian coordinate system.
 *
 * @author Yoav Amit
 * @version 04-15-2023
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
     * Returns a string representation of the point in the format (x,y).
     * @return a string representation of the point in the format (x,y)
     */
    public String toString() {
        return "(" + _x + ", " + _y + ")";
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

    /**
     * States whether two points are equal.
     *
     * @param other the other point to compare to
     * @return true if the points are equal, false otherwise
     */
    public boolean compare(Point other) {
        return _x == other.getX() && _y == other.getY();
    }

    /**
     * States whether the point is above another point.
     *
     * @param other the other point to compare to
     * @return true if the point is above the other point, false otherwise
     */
    public boolean isAbove(Point other) {
        return _y > other._y;
    }

    /**
     * States whether the point is under another point.
     *
     * @param other the other point to compare to
     * @return true if the point is under the other point, false otherwise
     */
    public boolean isUnder(Point other) {
        return other.isAbove(this);
    }

    /**
     * States whether the point is to the right of another point.
     *
     * @param other the other point to compare to
     * @return true if the point is to the right of the other point, false otherwise
     */
    public boolean isRight(Point other) {
        return _x > other._x;
    }

    /**
     * States whether the point is to the left of another point.
     *
     * @param other the other point to compare to
     * @return true if the point is to the left of the other point, false otherwise
     */
    public boolean isLeft(Point other) {
        return other.isRight(this);
    }

    /**
     * Returns the x coordinate of the point.
     * @return the x coordinate of the point
     */
    public int getX() {
        return _x;
    }

    /**
     * @return the y coordinate of the point
     */
    public int getY() {
        return _y;
    }
} // end of class Point
