import java.awt.geom.Ellipse2D;

/**
Creates an ellipse in the form of a circle
*/
public class Spot extends Ellipse2D.Double
{
    /**
    Given the coordinates of the centre of the circle and the radius, it creates a circle
    @param x the x coordinate of the centre
    @param y the y coordinate of the centre
    @param r the radius of the circle
    */
    public Spot(double x, double y, double r)
    {
        super(x-r, y-r, 2*r, 2*r);
    }
}