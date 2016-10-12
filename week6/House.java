import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 Construction of house graphics
 */
 public class House
{
	private Rectangle house;
	private Rectangle door; 
	private Line2D.Double roof1;
        private Line2D.Double roof2;

	/**
	Create main body, door, and roof of the house
	*/
	public House(int xCoord, int yCoord, int houseSize)
	{
		house = new Rectangle(xCoord, yCoord, houseSize, houseSize);
                door = new Rectangle (xCoord + (int)(0.5*houseSize), yCoord + (int)(0.6*houseSize), (int)(0.2*houseSize), (int)(0.4*houseSize)); 
                roof1 = new Line2D.Double(xCoord, yCoord, xCoord + (0.5*houseSize), yCoord - (0.4*houseSize));
                roof2 = new Line2D.Double(xCoord + houseSize, yCoord, xCoord + (0.5*houseSize), yCoord - (0.4*houseSize));
	}
	
	/**
	Draw the house on a graphics object
	*/
	public void draw(Graphics2D g)
	{
		g.setColor(Color.BLACK);
		g.draw(house);
		
		g.setColor(Color.BLACK);
		g.draw(door);
		
		g.setColor(Color.BLACK);
		g.draw(roof1);
                
                g.setColor(Color.BLACK);
		g.draw(roof2);
	}
}
	
	
	
	
	
	
	
	
