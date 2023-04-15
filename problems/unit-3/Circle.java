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
     * Copy constructor for objects of class Circle. Takes in another circle and copies its radius and center.
     * @param other the other circle to copy
     */
    public Circle(Circle other) {
        if (other != null) {
            _radius = other._radius;
            _center = new Point(other._center);
        }
    }

    // methods
    public String toString() {
        return "radius: " + _radius + ", center" + _center;
    }


}
