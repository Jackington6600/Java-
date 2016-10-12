import java.util.Scanner;

public class Question8 {

    public static void main(String[] args)
    {
        while (true)
        {
            Scanner reader = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int input = reader.nextInt();
            
            if (input>0)
            {
                int output = (int) Math.sqrt(input);
                if (output*output == input)
                {
                   System.out.println("The number " + input + " is the square of " + output + ".");
                }
                else
                {
                    System.out.println("The number " + input + " is not a square.");
                }
            }
            
            if (input<=0)
            {
                System.out.println("Please input an integer greater than 0.");
            }
        }
        
    }
    
}
