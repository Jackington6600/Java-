import java.util.Objects;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args)
    {
        Scanner user_input = new Scanner( System.in );
        System.out.print("Please input a string: ");
        String input = user_input.nextLine();
        String inputLower = input.toLowerCase();
        
        String output =  new StringBuilder(inputLower).reverse().toString();
        
        System.out.println(inputLower + " backwards is " + output);
        
        if (Objects.equals(inputLower, output))
        {
            System.out.println("It is a palindrome.");
        }
        else
        {
            System.out.println("It is not a palindrome.");
        }
    
    }
    
}