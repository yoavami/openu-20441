/*
Triangle.java
This program asks the user for 3 integers and outputs what type of triangle they represent.
@Author: Yoav Amit
 */

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {

        // Requesting user input and creating a scanner object
        Scanner scan = new Scanner (System.in);
        System.out.println ("Please enter 3 integers ");
        System.out.println ("Please enter the first side of the triangle:");
        int a = scan.nextInt();
        System.out.println ("Please enter the second side of the triangle:");
        int b = scan.nextInt();
        System.out.println ("Please enter the third side of the triangle:");
        int c = scan.nextInt();

        // Checking what type of triangle it is.
        // First check is to see if it even is a triangle (using Sides of Triangle Rule)
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if (a == b && b == c) {
                System.out.println("The numbers: " + a + ", " + b + " and " + c + " represent an equilateral triangle");
            } else if (a == b || b == c || a == c) {
                System.out.println("The numbers: " + a + ", " + b + " and " +  c + " represent an isosceles triangle");
            } else if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2) || Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2) || Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2)) {
                System.out.println("The numbers: " + a + ", " + b + " and " +  c + " represent a right-angle triangle");
            } else {
                System.out.println("The numbers: " + a + ", " + b + " and " +  c + " represent a common triangle");
            }
        } else {
            System.out.println("The numbers: " + a + ", " + b + " and " +  c + " cannot represent a triangle");
        }
    }
}
