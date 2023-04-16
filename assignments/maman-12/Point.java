/**
 * This class represents a point in a Cartesian coordinate system.
 * The point is in the first quadrant, meaning that the x and y coordinates are positive.
 * @author Yoav Amit
 * @version 04-16-2023
 */
public class Point {

    // instance variables
    private int _x;
    private int _y;
    private final int DEFAULT_VAL = 0;

    // constructors
    /**
     * Constructor for objects of class Point that takes in two parameters for the x and y coordinates.
     * If the x or y coordinate is negative, it is set to 0.
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     */
    public Point(int x, int y) {
        _x = Math.max(x, DEFAULT_VAL);
        _y = Math.max(y, DEFAULT_VAL);
    }

    /**
     * Copy constructor for objects of class Point.
     * @param other the other point to copy
     */
    public Point(Point other) {
        if (other != null) {
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
        if (x >= DEFAULT_VAL) {
            _x = x;
        }
    }

    /**
     * Returns the y coordinate of the point.
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
        if (y >= DEFAULT_VAL) {
            _y = y;
        }
    }

    // methods
    /**
     * Returns a string representation of the point.
     * @return a string representation of the point
     */
    public String toString() {
        return "(" + _x + "," + _y + ")";
    }

    /**
     * Returns whether the point is equal to another point.
     * @param other the other point to compare to
     * @return true if the points are equal, false otherwise
     */
    public boolean equals(Point other) {
        return (_x == other.getX() && _y == other.getY());
    }

    /**
     * Returns whether the point is above another point.
     * @param other the other point to compare to
     * @return true if the point is above the other point, false otherwise
     */
    public boolean isAbove(Point other) {
        return (_y > other.getY());
    }

    /**
     * Returns whether the point is below another point
     * @param other the other point to compare to
     * @return true if the point is below the other point, false otherwise
     */
    public boolean isUnder(Point other) {
        return (other.isAbove(this));
    }

    /**
     * Returns whether the point is left of another point.
     * @param other the other point to compare to
     * @return true if the point is left of the other point, false otherwise
     */
    public boolean isLeft(Point other) {
        return (_x < other.getX());
    }

    /**
     * Returns whether the point is right of another point.
     * @param other the other point to compare to
     * @return true if the point is right of the other point, false otherwise
     */
    public boolean isRight(Point other) {
        return (other.isLeft(this));
    }

    /**
     * Moves the point by a given amount in the x and y directions. If the x or y coordinate is negative, it is not changed.
     * @param dx the amount to move the point in the x direction
     * @param dy the amount to move the point in the y direction
     */
    public void move(int dx, int dy) {
        setX(_x + dx);
        setY(_y + dy);
    }

    /**
     * Creates a new point that is the middle of one point and another point.
     * @param p the other point to use
     * @return a new point that is the middle of the two points
     */
    public Point middle(Point p) {
        return new Point((_x + p.getX()) / 2, (_y + p.getY()) / 2);
    }

    /**
     * Returns the distance between the point and another point.
     * @param p the other point to use
     * @return the distance between the two points
     */
    public double distance(Point p) {
        return Math.sqrt(Math.pow(_x - p.getX(), 2) + Math.pow(_y - p.getY(), 2));
    }
}
