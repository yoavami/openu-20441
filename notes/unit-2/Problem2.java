import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int num, ones, tens, hundreds;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 3 digit number: ");
        num = input.nextInt();

        hundreds = num/100;
        tens = num/10%10;
        ones = num%10;

        System.out.println(ones);
        System.out.println(tens);
        System.out.println(hundreds);
    }
}