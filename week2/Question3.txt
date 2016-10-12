import java.util.Scanner;
import java.util.ArrayList;

public class Question3 {

    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();
    System.out.print("Enter a string (enter stop to finish): ");
    String s = in.nextLine();
    
    while(!s.equals("stop"))
    {
        list.add(s);
        System.out.print("Enter a string (enter stop to finish): ");
        s = in.nextLine();
    }
    
    for (int i=0; i<list.size();i++)
    {
        String current = list.get(i);
        if (current.length()>3)
        {
            System.out.println((list.get(i)).substring(0, 3));
        }
        else
        {
            System.out.println(list.get(i)); //Wasn't entirely sure if the strings with less than (or equal to) 3 characters should still be printed. If not, simply remove this line.
        }
        
    }
    }
}
