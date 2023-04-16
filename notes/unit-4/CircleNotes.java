/**
 * Class {@code Circle} represents a circle in the first quadrant of a Cartesian coordinate system.
 * @author Yoav Amit
 * @version 04-15-2023
 */
public class CircleNotes {

    // instance variables
    private double _radius;
    private PointNotes _center;
    private final int DEFAULT_RADIUS = 1;
    private final int DEFAULT_VAL = 0;

    // constructors
    /**
     * Default constructor for objects of class Circle.
     * The radius is set to 0 and the center is set to (0,0).
     */
    public CircleNotes() {
        _center = new PointNotes();
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
    public CircleNotes(int x, int y, double radius) {
        _center = new PointNotes(x, y);
        _radius = Math.max(radius, DEFAULT_RADIUS);
    }

    /**
     * Constructor for objects of class Circle that takes in a radius and a point for the center.
     * @param radius the radius of the circle
     * @param center the center of the circle
     */
    public CircleNotes(PointNotes center, double radius) {
        _center = new PointNotes(center);
        _radius = Math.max(radius, DEFAULT_RADIUS);
    }

    /**
     * Copy constructor for objects of class Circle. Takes in another circle and copies its radius and center.
     * @param other the other circle to copy
     */
    public CircleNotes(CircleNotes other) {
        if (other != null) {
            _center = new PointNotes(other._center);
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
    public PointNotes getCenter() {
        return new PointNotes(_center);
    }

    /**
     * Sets the center {@code Point} of the circle.
     * @param center the center {@code Point} of the circle
     */
    public void setCenter(PointNotes center) {
        _center = new PointNotes(center);
    }

    /**
     * Sets the center {@code Point} of the circle.
     * @param x the x coordinate of the center
     * @param y the y coordinate of the center
     */
    public void setCenter(int x, int y) {
        _center = new PointNotes(x, y);
    }

    // methods
    /**
     * Returns a string representation of the circle
     * in the format "radius: , center: ".
     * @return a string representation of the circle
     */
    public String toString() {
        return "The center of the circle = " + _center + ", and the radius = " + _radius;
    }

    /**
     * Returns the perimeter of the circle.
     * @return the perimeter of the circle
     */
    public double perimeter() {
        return 2 * Math.PI * _radius;
    }

    /**
     * Returns the area of the circle.
     * @return the area of the circle
     */
    public double area() {
        return Math.PI * Math.pow(_radius, 2);
    }

    /**
     * Moves the circle by a given amount in the x and y directions.
     * @param dx the amount to move in the x direction
     * @param dy the amount to move in the y direction
     */
    public void move(int dx, int dy) {
        _center.move(dx, dy);
    }

    /**
     * Returns whether the circle is equal to another circle.
     * @param other the other circle to compare to
     * @return true if the circles are equal, false otherwise
     */
    public boolean equals(CircleNotes other) {
        return _center.equals(other._center) && _radius == other._radius;
    }

    /**
     * Returns whether the circle is larger than another circle.
     * @param other the other circle to compare to
     * @return true if the circle is larger, false otherwise
     */
    public boolean isLarger(CircleNotes other) {
        return _radius > other._radius;
    }

    /**
     * Returns whether a given point is inside the circle.
     * @param p the point to check
     * @return true if the point is inside the circle, false otherwise
     */
    public boolean isInside(PointNotes p) {
        return _center.distance(p) <= _radius;
    }
} // end of class Circle
