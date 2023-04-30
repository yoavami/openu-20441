import java.util.Scanner;

public class LoopNotes {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        String decision = "True";

        for (int i = 0, j = input.length() - 1; i < j && decision.equals("True"); i++, j--) {
            if (!(input.charAt(i) == input.charAt(j))) {
                decision = "False";
            }
        }
        System.out.println(decision);


        
        
    }
}