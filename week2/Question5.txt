import java.util.Scanner;
import java.util.ArrayList;

public class Question5 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.print("Enter a string (enter stop to finish): ");
        String s = in.nextLine();
        int x=0;

        while(!s.equals("stop"))
        {
            list.add(s);
            System.out.print("Enter a string (enter stop to finish): ");
            s = in.nextLine();
        }

        ArrayList<Integer> listcount = new ArrayList<Integer>();

        for (int i=0; i<list.size();i++)
        {
            String current = list.get(i);
            x=0;
            for (int o=0; o<list.size(); o++)
            {
                String test = list.get(o);
                if (test.equals(current))
                {
                    x=x+1;
                }
                else
                {

                }
            }
            listcount.add(x);
        }

        for (int i=list.size(); i>=1;i--)
        {
            if (listcount.contains(i))
            {
                System.out.println("The most frequent string was " + list.get(listcount.indexOf(i)) + ".");
                break;
            }
            else
            {

            } 
        }
    }
}