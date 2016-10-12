import java.util.Scanner;

public class Question5 {


    public static void main(String[] args)
    {
        Scanner user_input = new Scanner( System.in );
        System.out.print("Please input a string: ");
        String input = user_input.nextLine();
        String inputLower = input.toLowerCase();
        int i;
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        
	
        for (i=0; i<alpha.length(); i++)
        {
            int a = inputLower.indexOf(alpha.charAt(i));
            
            if (a==-1)
            {

            }
            else
            {
                System.out.println("The first letter alphabetically is: " + alpha.charAt(i));
                break;
            }
            
        }

    }

}