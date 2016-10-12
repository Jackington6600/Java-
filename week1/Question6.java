import java.util.Scanner;

public class Question6 {

    public static void main(String[] args)
    {
        Scanner user_input = new Scanner( System.in );
        System.out.print("Please input a string: ");
        String input = user_input.nextLine();
        String inputLower = input.toLowerCase();
        int i;
        String output = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        
        
        for (i=0; i<alpha.length(); i++)
        {
        int a = inputLower.indexOf(alpha.charAt(i));
            while (a!=-1)
            {
            a = inputLower.indexOf(alpha.charAt(i));
                if (a==-1)
                {

                }
                else
                {
                    output += inputLower.substring(a,a+1);
                    inputLower = inputLower.replaceFirst(inputLower.substring(a,a+1),"");
                }
            }
        }
        
        System.out.println(input + " sorted alphabetically is: " + output);
    }
    
}