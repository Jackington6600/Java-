import javax.swing.JPanel;
import javax.swing.JSlider;

public class EasterComponent extends JPanel
{
	public EasterComponent(Easter easter, int min, int max, int initial)
	{
		super();
		
		//model
		EasterModel model = new EasterModel(easter);

		//views
		EasterView eastr = new EasterView(model);

		//views observe model
		model.addObserver(eastr);
		
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
		add(slider);
		add(eastr);
		
		
	}
}