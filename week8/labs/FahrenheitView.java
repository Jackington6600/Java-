import javax.swing.JLabel;
import java.util.Observer;
import java.util.Observable;

public class FahrenheitView extends JLabel implements Observer
{
	private TemperatureModel model;
	
	public FahrenheitView(TemperatureModel model)
	{
		super();
		this.model = model;
		
		double value = Math.floor(10*model.getFahrenheit())/10;
		setText(value + " Fahrenheit");
	}

	public void update(Observable obs, Object obj)
	{
		double value = Math.floor(10*model.getFahrenheit())/10;
		setText(value + " Fahrenheit");
	}

}
