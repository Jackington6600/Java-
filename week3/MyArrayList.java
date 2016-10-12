import java.util.Arrays;

public class MyArrayList
{

// data fields
	private int numberOfStrings = 0;
	private Object[] strings;
        private int size = 10;
        
// constructor

	public MyArrayList()
	{
		strings = new Object[size];
                
	}

// set methods

        public void add(String s)
        {
            if (numberOfStrings==size)
            {
                strings = Arrays.copyOf(strings, (strings.length)+10);
                size = strings.length;
                strings[numberOfStrings++] = s;
            }
            else
            {
            strings[numberOfStrings++] = s;
            }
        }

// get methods        
        public Object get(int index)
	{
            if (index>=0 && index<numberOfStrings)
            {
		return this.strings[index];
            }
            else
            {
                System.out.println("Index is out of bounds.");
                return null;
            }
	}
}
