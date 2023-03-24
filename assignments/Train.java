/************
Train.java
This program takes the speed and travel time of two seperate trains and outputs the distance between them
 ***********/

import java.util.Scanner;

public class Train {
    public static void main(String[] args){

        // Declarations
        int Speed1;
        int Time1;
        int Speed2;
        int Time2;
        double DistanceTrain1;
        double DistanceTrain2;
        double DistanceBetweenTrains;
        Scanner input = new Scanner(System.in);

        // Asking for information
        System.out.print("Enter train 1 speed (kp/h): ");
        Speed1 = input.nextInt();
        System.out.print("Enter train 1 time (min): ");
        Time1 = input.nextInt();
        System.out.print("Enter train 2 speed (kp/h): ");
        Speed2 = input.nextInt();
        System.out.print("Enter train 2 time (min): ");
        Time2 = input.nextInt();

        // Calculating the distances of the individual trains. We divide by 60.0 to convert minutes to hours and a double.
        DistanceTrain1 = (Time1 / 60.0) * Speed1;
        DistanceTrain2 = (Time2 / 60.0) * Speed2;
        DistanceBetweenTrains = Math.abs(DistanceTrain2 - DistanceTrain1);

        // Returning the value to the user
        System.out.println("The distance between the trains is " + DistanceBetweenTrains + " km.");
    }
}