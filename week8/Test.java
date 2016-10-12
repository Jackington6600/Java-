public class Test
{
    
    public static void main(String[] args)
    {
        
        Easter a = new Easter(1997);
        System.out.println(a.getYear());
        System.out.println(a.getDay());
        System.out.println(a.getMonth());
        
        a.setYear(2004);
        System.out.println(a.getYear());
        System.out.println(a.getDay());
        System.out.println(a.getMonth());
        
        
    }
    
    
}