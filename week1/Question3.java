import java.util.Scanner;

public class Question3 {


    public static void main(String[] args)
    {
        Scanner user_input = new Scanner( System.in );
        
        System.out.print("Please input a number: ");
        int n = user_input.nextInt();
        String star = "*";
        
        if (n<=0)
        {
            System.out.println("A positive number greater than 0 is required.");
        }
        
        while (n>0)
        {
            for(int i=0; i<n; i++)
            {
                System.out.print(star);
            }
            
            System.out.print("\n");
            n = n - 1;
            
        }
    }  
}