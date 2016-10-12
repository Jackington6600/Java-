import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
Component containing a snowman
*/
public class SnowmanComponent extends JComponent
{
	private Snowman frosty;
	
	/**
	Create a component with a particular snowman location and size
	@param xCoord x coordinate of snowman
	@param y coordinate of snowman
	@param headSize size of snowmans head
	*/
	public SnowmanComponent(int xCoord, int yCoord, int headSize)
	{
		super();
		frosty = new Snowman(xCoord, yCoord, headSize);
	}
	
	/**
	paint component on graphics object
	@param g the graphics object
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		frosty.draw(g2);
	}
}
	
	
	
	
	
	
	
	
