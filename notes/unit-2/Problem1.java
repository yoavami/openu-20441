import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        int height;
        int width;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height: ");
        height = input.nextInt();
        System.out.print("Enter the width: ");
        width = input.nextInt();

        System.out.println("The perimeter of the rectangle is: " + (2*(width+height)));
        System.out.println("The area of the rectangle is: " + height*width);
    }
}