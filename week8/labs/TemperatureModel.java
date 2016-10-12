import java.util.Observable;

public class TemperatureModel extends Observable
{

	private Temperature temp;
	
	public TemperatureModel(Temperature temp)
	{
		
		super();
		this.temp = temp;

	}
	

	public double getCelcius()
	{
		return temp.getCelcius();
	}
	

	public double getFahrenheit()
	{
		return temp.getFahrenheit();
	}


	public void setCelcius(double celcius)
	{
		
		temp.setCelcius(celcius);
		setChanged();
		notifyObservers();
	}

	public void setFahrenheit(double fahrenheit)
	{
		
		temp.setFahrenheit(fahrenheit);
		setChanged();
		notifyObservers();
	}

}

