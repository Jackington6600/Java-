import java.util.Scanner;
import java.util.ArrayList;

public class Question1 {

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
    
    String longest="";
    for (int i=0; i<list.size();i++)
    {
        String current = list.get(i);
        if (current.length()>longest.length())
        {
            longest=current;
        }
        else
        {
            
        }
        
    }
    System.out.println(longest + " was the longest string.");
    }
}
