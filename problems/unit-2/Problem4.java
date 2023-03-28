import java.util.Scanner;

public class Problem4 {
  public static void main(String[] args){

      Scanner input = new Scanner(System.in);

      System.out.println("Enter your age and salary:");
      int age = input.nextInt();
      double salary = input.nextDouble();

      if (18 <= age && age < 67) {
          salary -= 100;
      }
      else
          salary += 200;

      System.out.println("Your updated salary is " + salary + "₪");
  }
}