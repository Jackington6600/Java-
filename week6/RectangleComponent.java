import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
A component to hold a rectangle
*/
public class RectangleComponent extends JComponent
{
	private int xCoord;
	private int yCoord;
	
	/**
	Construct a component with specified coordinates for rectangle location
	@param xCoord x coordinate of top-left corner
	@param yCoord y coordinate of top left corner
	*/
	public RectangleComponent(int xCoord, int yCoord)
	{
		super();
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	
	/**
	Draw a rectangle
	@param g the graphics object
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle box = new Rectangle(xCoord, yCoord, 200, 100);
		Color c = new Color(0, 255, 0);
		g2.setColor(c);

		g2.drawString("Here is a rectangle", 50, 50);
		g2.setColor(Color.WHITE);
		g2.fill(box);
		g2.draw(box);
	}
}
