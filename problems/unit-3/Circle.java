/**
 * Class {@code Circle} represents a circle in the first quadrant of a Cartesian coordinate system.
 * @author Yoav Amit
 * @version 04-15-2023
 */
public class Circle {

    // instance variables
    private double _radius;
    private Point _center;
    private final int DEFAULT_RADIUS = 1;
    private final int DEFAULT_VAL = 0;

    // constructors
    /**
     * Default constructor for objects of class Circle.
     * The radius is set to 0 and the center is set to (0,0).
     */
    public Circle() {
        _center = new Point();
        _radius = DEFAULT_RADIUS;
    }

    /**
     * Constructor for objects of class Circle that takes in two parameters for the x and y coordinates of the center.
     * If the x or y coordinate is negative, it is set to 0.
     * The radius is set to 1 if it is negative.
     * @param x the x coordinate of the center
     * @param y the y coordinate of the center
     * @param radius the radius of the circle
     */
    public Circle(int x, int y, double radius) {
        _center = new Point(x, y);
        _radius = Math.max(radius, DEFAULT_RADIUS);
    }

    /**
     * Constructor for objects of class Circle that takes in a radius and a point for the center.
     * @param radius the radius of the circle
     * @param center the center of the circle
     */
    public Circle(Point center, double radius) {
        _center = new Point(center);
        _radius = Math.max(radius, DEFAULT_RADIUS);
    }

    /**
     * Copy constructor for objects of class Circle. Takes in another circle and copies its radius and center.
     * @param other the other circle to copy
     */
    public Circle(Circle other) {
        if (other != null) {
            _center = new Point(other._center);
            _radius = other._radius;
        }
    }

    // getters and setters
    /**
     * Returns the radius of the circle.
     * @return the radius of the circle
     */
    public double getRadius() {
        return _radius;
    }

    /**
     * Sets the radius of the circle.
     * If the radius is negative, it is not changed.
     * @param radius the radius of the circle
     */
    public void setRadius(double radius) {
        _radius = Math.max(radius, DEFAULT_RADIUS);
    }

    /**
     * Returns the center {@code Point} of the circle.
     * @return the center {@code Point} of the circle
     */
    public Point getCenter() {
        return _center;
    }

    /**
     * Sets the center {@code Point} of the circle.
     * @param center the center {@code Point} of the circle
     */
    public void setCenter(Point center) {
        _center = new Point(center);
    }

    /**
     * Sets the center {@code Point} of the circle.
     * @param x the x coordinate of the center
     * @param y the y coordinate of the center
     */
    public void setCenter(int x, int y) {
        _center = new Point(x, y);
    }

    // methods
    public String toString() {
        return "radius: " + _radius + ", center: " + _center;
    }
}
