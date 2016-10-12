import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Line2D;

/**
Component containing a graph of the virus
*/
public class VirusComponent extends JComponent
{
	private double[] infected;
        private int frameSize;
	
	/**
	Create a graph showing how the proportion of infected changes over time
	@param frameSize the size of the frame that the graph will be plotted
	@param virusArray the array of the proportion of infected
	*/
	public VirusComponent(int frameSize, double[] virusArray)
	{
		super();
		this.frameSize = frameSize;
                this.infected = virusArray;
                
                
                
	}
	
	/**
	paint component on graphics object
	@param g the graphics object
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
                /*
                Line2D.Double xAxis = new Line2D.Double(0.25*frameSize, frameSize, 0.25*frameSize + infected.length, frameSize);;
                g2.setColor(Color.BLACK);
                g2.draw(xAxis);
                Line2D.Double yAxis = new Line2D.Double(0.25*frameSize, 0.25*frameSize, 0.25*frameSize, frameSize);;
                g2.setColor(Color.BLACK);
                g2.draw(yAxis);
                g2.drawString("Infections", (int)(0.20*frameSize), (int)(0.22*frameSize));
                g2.drawString("Time", (int)(0.25*frameSize + 0.5*infected.length), (int)(1.05*frameSize));
		
                for(int i = 0; i < infected.length; i++)
                {
                    //Rectangle plot = new Rectangle(i, (int)(frameSize - (infected[i]*frameSize)), 1, 1);
                    Rectangle plot = new Rectangle((int)(i + 0.25*frameSize), (int)(frameSize - (infected[i]*frameSize)), 1, 1);
                    g2.setColor(Color.BLACK);
                    g2.fill(plot);
                    
                }
		*/
                
                int height = getHeight();
                int width = getWidth();
                
                Line2D.Double xAxis = new Line2D.Double(0.2*width, 0.8*height, 0.8*width, 0.8*height);;
                g2.setColor(Color.BLACK);
                g2.draw(xAxis);
                Line2D.Double yAxis = new Line2D.Double(0.2*width, 0.2*height, 0.2*width, 0.8*height);;
                g2.setColor(Color.BLACK);
                g2.draw(yAxis);
                g2.drawString("Infections", (int)(0.2*width - 20), (int)(0.2*height - 5));
                g2.drawString("Time", (int)(0.5*width), (int)(0.8*height + 15));
		
                for(int i = 0; i < infected.length; i++)
                {
                    Rectangle plot = new Rectangle((int)(((double)(i)/infected.length)*0.6*width + 0.2*width), (int)(0.8*height - (infected[i])*0.6*height), 1, 1);
                    g2.setColor(Color.BLACK);
                    g2.fill(plot);
                    
                }
                
	}
}
	
	
	
	
	
	
	
	
