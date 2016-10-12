import javax.swing.JPanel;
import java.util.Observer;
import java.util.Observable;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Line2D;

/**
The view of the Spatial Network
 */
public class SpatialView extends JPanel implements Observer
{
    private SpatialModel model;
    
    /**
    Creates the Spatial View using the model of the Spatial Network
    @param model the Spatial Model
    */
    public SpatialView(SpatialModel model)
    {
        super();
        this.model = model;
    }
    
    /**
    The paint component that draws the points and connects them if they are within the threshold
    @param g the graphics object
    */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;

        int height = getHeight();
        int width = getWidth();

        g2.clearRect(0, 0, width, height);	

        double diameter = Math.min(height, width);

        g2.setColor(Color.BLACK);


        for(int i = 0; i < model.getNumNodes(); i++)
        {
            for(int j = 0; j < model.getNumNodes(); j++)
            {
                double xi = (model.getNode(i).getX());
                double yi = (model.getNode(i).getY());
                Spot p = new Spot(xi*diameter, yi*diameter, 0.005*diameter);

                g2.fill(p);


                double xj = (model.getNode(j).getX());
                double yj = (model.getNode(j).getY());

                if(model.connected(model.getNode(i), model.getNode(j)))
                {
                    Line2D.Double connect = new Line2D.Double(xi*diameter, yi*diameter, xj*diameter, yj*diameter);
                    g2.draw(connect);
                }
            }
        }
    }

    /**
    Repaints the network when the threshold or the number of nodes changes
    @param obs an Observable object
    @param obj an Object object
    */
    public void update(Observable obs, Object obj)
    {
        repaint();
    }
        
}