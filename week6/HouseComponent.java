import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
Component containing a house
*/
public class HouseComponent extends JComponent
{
	private House house1;
	
	/**
	Create a component with a particular house location and size
	@param xCoord x coordinate of the house
	@param yCoord y coordinate of the hosue
	@param houseSize size of the house (main body of the house)
	*/
	public HouseComponent(int xCoord, int yCoord, int houseSize)
	{
		super();
		house1 = new House(xCoord, yCoord, houseSize);
	}
	
	/**
	paint component on graphics object
	@param g the graphics object
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		house1.draw(g2);
	}
}
	
	
	
	
	
	
	
	
