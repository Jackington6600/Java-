import javax.swing.JPanel;
import javax.swing.JSlider;
import java.util.Observer;
import java.util.Observable;

public class TemperatureComponent extends JPanel
{
	public TemperatureComponent(Temperature temp, int min, int max, int initial)
	{
		super();
		
		//model
		TemperatureModel model = new TemperatureModel(temp);

		//views
		CelciusView celcius = new CelciusView(model);
		FahrenheitView fahrenheit = new FahrenheitView(model);

		//views observe model
		model.addObserver(fahrenheit);
		model.addObserver(celcius);
		
		//controls
		JSlider slider = new JSlider(min, max, initial);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing( ((max - min)/4) );
		slider.setPaintLabels(true);
		slider.setLabelTable( slider.createStandardLabels((max - min)/4) );
		
		//listeners
		SliderListener listen = new SliderListener(model, slider);
		
		//listeners -> controls
		slider.addChangeListener(listen);
		
		//listeners + controls -> panel
		add(celcius);
		add(slider);
		add(fahrenheit);
		
		
	}
}
