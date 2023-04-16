/**
 * Class {@code Point} represents a point in the first quarter of a Cartesian coordinate system.
 * @author Yoav Amit
 * @version 04-15-2023
 */
public class PointNotes {

    // instance variables
    private int _x;
    private int _y;
    private final int DEFAULT_VAL = 0;

    // constructors
    /**
     * Default constructor for objects of class Point.
     */
    public PointNotes() {
        _x = 0;
        _y = 0;
    }

    /**
     * Constructor for objects of class Point that takes in two parameters for the x and y coordinates.
     * If the x or y coordinate is negative, it is set to 0.
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     */
    public PointNotes(int x, int y) {
        _x = Math.max(x, DEFAULT_VAL);
        _y = Math.max(y, DEFAULT_VAL);
    }

    /**
     * Copy constructor for objects of class Point.
     * @param other the other point to copy
     */
    public PointNotes(PointNotes other) {
        if(other != null) {
            _x = other._x;
            _y = other._y;
        }
    }

    // getters and setters
    /**
     * Returns the x coordinate of the point.
     * @return the x coordinate of the point
     */
    public int getX() {
        return _x;
    }

    /**
     * Sets the x coordinate of the point.
     * If the x coordinate is negative, it is not changed.
     * @param x the x coordinate of the point
     */
    public void setX(int x) {
        if(x >= DEFAULT_VAL) {
            _x = x;
        }
    }

    /**
     * @return the y coordinate of the point
     */
    public int getY() {
        return _y;
    }

    /**
     * Sets the y coordinate of the point.
     * If the y coordinate is negative, it is not changed.
     * @param y the y coordinate of the point
     */
    public void setY(int y) {
        if(y >= DEFAULT_VAL) {
            _y = y;
        }
    }

    // methods
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
     * States whether two points are equal.
     *
     * @param other the other point to compare to
     * @return true if the points are equal, false otherwise
     */
    public boolean equals(PointNotes other) {
        return _x == other.getX() && _y == other.getY();
    }

    /**
     * States whether the point is above another point.
     *
     * @param other the other point to compare to
     * @return true if the point is above the other point, false otherwise
     */
    public boolean isAbove(PointNotes other) {
        return _y > other._y;
    }

    /**
     * States whether the point is under another point.
     *
     * @param other the other point to compare to
     * @return true if the point is under the other point, false otherwise
     */
    public boolean isUnder(PointNotes other) {
        return other.isAbove(this);
    }

    /**
     * States whether the point is to the right of another point.
     *
     * @param other the other point to compare to
     * @return true if the point is to the right of the other point, false otherwise
     */
    public boolean isRight(PointNotes other) {
        return _x > other._x;
    }

    /**
     * States whether the point is to the left of another point.
     *
     * @param other the other point to compare to
     * @return true if the point is to the left of the other point, false otherwise
     */
    public boolean isLeft(PointNotes other) {
        return other.isRight(this);
    }

    /**
     * Returns the distance between the point and another point.
     *
     * @param other the other point to compare to
     * @return the distance between the point and the other point
     */
    public double distance(PointNotes other) {
        return Math.sqrt(Math.pow(_x - other._x, 2) + Math.pow(_y - other._y, 2));
    }
} // end of class Point
