import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
Component containing a street of houses
*/
public class StreetComponent extends JComponent
{
        private House[] houses;
	
	/**
	Create a street component with a particular start location, size of each house, and number of houses
	@param xCoord x coordinate of the start of the street
	@param yCoord y coordinate of the start of the street
	@param houseSize size of each house
        @param noHouses the number of houses on the street
	*/
	public StreetComponent(int xCoord, int yCoord, int houseSize, int noHouses)
	{
		super();
                
                houses = new House[noHouses];
                
                for(int i = 0; i < noHouses; i++)
                {
                    House house1 = new House(xCoord + i*(houseSize + (int)(0.2*houseSize)), yCoord, houseSize);
                    houses[i] = house1;
                }
		
                
                
	}
	
	/**
	paint component on graphics object
	@param g the graphics object
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
                for(int i = 0; i < houses.length; i++)
                {
                    houses[i].draw(g2);
                }
	}
}
	
	
	
	
	
	
	
	
