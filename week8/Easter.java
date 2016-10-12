import java.util.ArrayList;

/**
Finding on what date Easter Sunday falls each year
*/

public class Easter
{
    
    private int year;
    private int day;
    private String month;
    
    /**
    Calculates the day and month that Easter Sunday falls given a year
    @param year the year
    */
    public Easter(int year)
    {
        this.year = year;
        
        int a = year % 19;
        int b = (int)(Math.floor(year/100));
        int c = year % 100;
        int d = (int)(Math.floor((double)(b)/4));
        int e = b % 4;
        int f = (int)(Math.floor((b+8)/25));
        int g = (int)(Math.floor((b-f+1)/3));
        int h = (19*a + b - d - g + 15) % 30;
        int i = (int)(Math.floor(c/4));
        int k = c % 4;
        int L = (32 + 2*e + 2*i - h - k) % 7;
        int m = (int)(Math.floor((a + 11*h + 22*L) / 451));
        int Month = (int)(Math.floor((h + L - 7*m + 114) / 31));
        this.day = ((h + L - 7*m + 114) % 31) + 1;
        
        ArrayList<String> months = new ArrayList<String>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        
        this.month = months.get(Month-1);

        
        
    }
    
    /**
    Get the current year
    @return the year
    */
    public int getYear()
    {
        return year;
    }
    
    
    /**
    Get the day Easter Sunday is on (using the current year)
    @return the day Easter Sunday is on
    */
    public int getDay()
    {
        return day;
    }
    
    
    /**
    Get the month that Easter Sunday is in
    @return the month Easter Sunday is in
    */
    public String getMonth()
    {
        return month;
    }
    
    /**
    Change the current year (will also update the day and month)
    @param year the year
    */
    public void setYear(int year)
    {
        this.year = year;
        
        int a = year % 19;
        int b = (int)(Math.floor(year/100));
        int c = year % 100;
        int d = (int)(Math.floor((double)(b)/4));
        int e = b % 4;
        int f = (int)(Math.floor((b+8)/25));
        int g = (int)(Math.floor((b-f+1)/3));
        int h = (19*a + b - d - g + 15) % 30;
        int i = (int)(Math.floor(c/4));
        int k = c % 4;
        int L = (32 + 2*e + 2*i - h - k) % 7;
        int m = (int)(Math.floor((a + 11*h + 22*L) / 451));
        int Month = (int)(Math.floor((h + L - 7*m + 114) / 31));
        this.day = ((h + L - 7*m + 114) % 31) + 1;
        
        ArrayList<String> months = new ArrayList<String>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        
        this.month = months.get(Month-1);
    }
    
    
    
    
    
}