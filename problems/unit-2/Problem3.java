import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){

        int side1, side2, side3, side4;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of side 1: ");
        side1 = input.nextInt();
        System.out.println("Enter the length of side 2: ");
        side2 = input.nextInt();
        System.out.println("Enter the length of side 3: ");
        side3 = input.nextInt();
        System.out.println("Enter the length of side 4: ");
        side4 = input.nextInt();

        if (side1 == side2 && side2 == side3 && side3 == side4) {
            System.out.println("Square");
        }
        else
            System.out.println("Not square");
        


    }
}