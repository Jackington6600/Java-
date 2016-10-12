import java.util.Scanner;

public class Question7 {


    public static void main(String[] args)
    {
        while (true)
        {
            Scanner reader = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int input = reader.nextInt();
            int x = 2;
            int n = 0;
            
            
            if (input>1)
            {
                while (x <= input / 2)
                {
                    if (input % x == 0)
                    {
                       n = 1;
                    }
                    x++;
                }

                if (n == 1)
                {
                    System.out.println("The number " + input + " is not prime.");
                }
                else
                {
                    System.out.println("The number " + input + " is prime. ");
                }
            }
            if (input==1 || input==0)
            {
                System.out.println("The number " + input + " is not prime.");
            }
            if (input<0)
            {
                System.out.println("Please input a positive integer.");
            }
        }
    }
    
}
