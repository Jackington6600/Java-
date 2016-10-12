import java.util.Scanner;
import java.util.ArrayList;

public class Question4 {

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
    
    ArrayList<String> listoutput = new ArrayList<String>();
    for (int i=0; i<list.size();i++)
    {
        String current = list.get(i);
        if (listoutput.contains(current))
        {
            
        }
        else
        {
            listoutput.add(current);
        }
        
    }
    System.out.println(listoutput);
    }
}
