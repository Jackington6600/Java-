public class TestArrayList
{

	public static void main(String[] args)
	{
                MyArrayList test = new MyArrayList();
                for (int i=0; i<50; i++)
                {
                    String n = "" + i;
                    test.add(n);
                    
                }
	
                System.out.println("String at index 0: " + test.get(0));
                System.out.println("String at index 34: " + test.get(34));
                System.out.println("String at index 49: " + test.get(49));
                System.out.println("String at index 50: " + test.get(50));
                System.out.println("String at index -1: " + test.get(-1));
                
	}
	
}
