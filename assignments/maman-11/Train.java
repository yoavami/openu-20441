/*
Train.java
This program takes the speed and travel time of two separate trains and outputs the distance between them
@Author: Yoav Amit
*/

import java.util.Scanner;

public class Train {
    public static void main(String[] args){

        // Declaring final variables
        final double MINUTES_TO_HOURS = 60.0;

        // Requesting user input including the declaration of speed and time variables.
        Scanner scan = new Scanner (System.in);
        System.out.println ("Please enter 4 integers ");
        System.out.println ("Please enter the speed of train 1:");
        int v1 = scan.nextInt();
        System.out.println ("Please enter the time of train 1:");
        int t1 = scan.nextInt();
        System.out.println ("Please enter the speed of train 2:");
        int v2 = scan.nextInt();
        System.out.println ("Please enter the time of train 2:");
        int t2 = scan.nextInt();

        // Declaring distance variables and calculating the distances of the individual trains. We divide by 60.0 to convert minutes to hours and a double.
        double DistanceTrain1 = (t1 / 60.0) * v1;
        double DistanceTrain2 = (t2 / 60.0) * v2;
        double DistanceBetweenTrains = Math.abs(DistanceTrain2 - DistanceTrain1);

        // Returning the value to the user
        System.out.println("The distance between the trains is " + DistanceBetweenTrains + " km.");
    }
}