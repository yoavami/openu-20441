

public class MyTestingPoint
{
    public static void main(String[] args)
    {
        System.out.println("Start testing for your class Point, good luck\n");
        System.out.println("1. Create new object by Point class \n2. Testing functions get set \n3. Testing over functions\n");
        System.out.println("=====================================");
        System.out.println("1. Create a new object, p1 (3, 4) p2 (-4, -7) p3 (-3, 6)\n Expected Result p1 = (3, 4), p2 = (0, 0), p3 = (0, 6)");
        Point p1 = new Point(3, 4);
        Point p2 = new Point(-4, -7);
        Point p3 = new Point(-3, 6);
        System.out.println("Is p1 equal (3, 4) ? ");
        System.out.println(p1.equals(new Point(3, 4)));
        System.out.println("Is p2 equal (0, 0) ? ");
        System.out.println(p2.equals(new Point(0, 0)));
        System.out.println("Is p3 equal (0, 6) ? ");
        System.out.println(p3.equals(new Point(0, 6)));
        System.out.println("=====================================");
        System.out.println("2. Testing get set");
        System.out.println("Expected Result p1.getX() == 3, p1.getY() == 4, p3.getX() == 0, p3.getY() == 6");
        System.out.println("p1.getX() = " + p1.getX() + " is " + (p1.getX() == 3)); 
        System.out.println("p1.getY() = " + p1.getY() + " is " + (p1.getY() == 4));
        System.out.println("p3.getX() = " + p3.getX() + " is " + (p3.getX() == 0));
        System.out.println("p1.getX() = " + p3.getY() + " is " + (p3.getY() == 6));
        System.out.println("Expected Result p1.setX(1) == (1, 4), p1.setY(0) == (1, 0) , p1.setX(-1) == (1, 0) , p1.setY(-9) == (1, 0), ");
        p1.setX(1);
        System.out.println(p1 + " equal " + p1.equals(new Point(1, 4)));
        p1.setY(0);
        System.out.println(p1 + " equal " + p1.equals(new Point(1, 0)));
        p1.setX(-1);
        System.out.println(p1 + " equal " + p1.equals(new Point(1, 0)));
        p1.setY(-9);
        System.out.println(p1 + " equal " + p1.equals(new Point(1, 0)));
        p1 = new Point(3, 4);
        System.out.println("For further tests, return the values p1 = (3, 4)");
        System.out.println("=====================================");
        System.out.println("3. Testing over functions");
        System.out.println("Expected Result for function p1.isAbove(3, 3) == true, p1.isAbove(3,4) == false");
        System.out.println("when (3, 3) " + p1.isAbove(new Point(3, 3)));
        System.out.println("when (3, 4) " + p1.isAbove(new Point(3, 4)));
        System.out.println("=====================================");
        System.out.println("Expected Result for function p1.isUnder(3, 5) == true, p1.isUnder(3,4) == false");
        System.out.println("when (3, 5) " + p1.isUnder(new Point(3, 5)));
        System.out.println("when (3, 4) " + p1.isUnder(new Point(3, 4)));
        System.out.println("=====================================");
        System.out.println("Expected Result for function p1.isLeft(4, 4) == true, p1.isLeft(3,4) == false");
        System.out.println("when (4, 4) " + p1.isLeft(new Point(4, 4)));
        System.out.println("when (3, 4) " + p1.isLeft(new Point(3, 4)));
        System.out.println("=====================================");
        System.out.println("Expected Result for function p1.isRight(2, 3) == true, p1.isRight(3,4) == false");
        System.out.println("when (2, 3) " + p1.isRight(new Point(2, 3)));
        System.out.println("when (3, 4) " + p1.isRight(new Point(3, 4)));
        System.out.println("=====================================");
        System.out.println("Now testing your function move");
        System.out.println("Expected Result for function p1.move(-2, -3) == (1, 1)");
        p1.move(-2, -3);
        System.out.println(p1 + " is equal (1, 1) ? " + p1.equals(new Point(1, 1)));
        System.out.println("Expected Result for function p2.move(-2, -3) == (0, 0)");
        p2.move(-2, -3);
        System.out.println(p2 + " is equal (0, 0) ? " + p2.equals(new Point(0, 0)));
        System.out.println("=====================================");
        System.out.println("Now testing your function middle");
        System.out.println("Expected Result for function p1.middle(3, 3) == new Point(2, 2)");
        Point pMiddle = p1.middle(new Point(3, 3));
        System.out.println("your new middle point is (2, 2) ? " + pMiddle.equals(new Point(2, 2)));
        System.out.println("=====================================");
        System.out.println("Now testing your function distance");
        System.out.println("Expected Result for function p1.distance(4, 5) == 5.0");
        System.out.println("Your result is " + p1.distance(new Point(4, 5)) + " ? " + (p1.distance(new Point(4, 5)) == 5.0));
        System.out.println("The end for testing your class Point");
    }
}
