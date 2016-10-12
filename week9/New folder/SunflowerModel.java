import java.util.Observable;
import java.util.ArrayList;
import java.awt.geom.Point2D;

public class SunflowerModel extends Observable
{
	private Sunflower sunflower;

	public SunflowerModel(Sunflower sunflower)
	{
		super();
		this.sunflower = sunflower;
	}

	public ArrayList<Point2D.Double> getSeeds()
	{
		return sunflower.getSeeds();
	}

	public double getAngle()
	{
		return sunflower.getAngle();
	}

	public void setAngle(double angle)
	{
		sunflower.setAngle(angle);
		setChanged();
		notifyObservers();
	}
}
