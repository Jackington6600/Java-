import java.util.Scanner;

public class Question1 {

    public static void main(String[] args)
    {
        Scanner user_input = new Scanner( System.in );
        System.out.print("Please input a number: ");
        int n = user_input.nextInt( ); user_input.nextLine();
        
        for (int i=0; i <= n; i += 2)
        {
            System.out.print(i + "\n");
        }
    
    }

}
