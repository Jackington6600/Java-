import java.util.Scanner;

public class Question2 {

    public static void main(String[] args)
    {
        Scanner user_input = new Scanner( System.in );
        
        int n;
        int small = Integer.MAX_VALUE;
        System.out.print("Please input a number: ");
        
        while ((n = user_input.nextInt()) >= 0)
        {
        System.out.print("Please input a number: ");
        
            if(n<small && n>=0)
            {
                small=n;
            }
        }
        
    System.out.println("The smallest number was " + small);
    
    }

}