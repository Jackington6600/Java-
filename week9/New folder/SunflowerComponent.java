import javax.swing.JPanel;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class SunflowerComponent extends JPanel
{
	public SunflowerComponent(Sunflower flower, int min, int max, int value)
	{
		super();
		
		SunflowerModel model = new SunflowerModel(flower);
		
		SunflowerView view = new SunflowerView(model);

		JButton reset = new JButton("Reset");
		
		reset.addActionListener( e -> model.setAngle(0.01 * value) );
/**		
		reset.addActionListener( new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					model.setAngle(0.01 * value);
				}
			}
		);
*/
		SliderControl slider = new SliderControl(model, min, max, value);
		slider.addChangeListener(e -> model.setAngle( 0.01* slider.getValue()));
/**
		slider.addChangeListener( new ChangeListener()
			{
				public void stateChanged(ChangeEvent e)
				{
					int v = slider.getValue();
					model.setAngle(v * 0.01);
					
				}

			}
		);
*/		
		model.addObserver(view);
		model.addObserver(slider);
		
		setLayout(new BorderLayout());
		add(view, BorderLayout.CENTER);
		add(slider, BorderLayout.SOUTH);
		add(reset, BorderLayout.EAST);
	}
}
