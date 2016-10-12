import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.event.*;
import javax.swing.JSlider;
import java.awt.BorderLayout;
import java.util.Observable;
import java.util.Observer;

/**
A panel to display a slider for the number of nodes in the network
*/
public class NumberPanel extends JPanel implements Observer
{
    SpatialModel model;
    JSlider slider;
    
    /**
    Creates the slider and gives it a name and places them both on the panel
    @param model the model
    @param min the min value of the slider
    @param max the max value of the slider
    @param value the initial value of the slider
    */
    public NumberPanel(SpatialModel model, int min, int max, int value)
    {
        super();

        this.model = model;

        JLabel number = new JLabel("Number of nodes:");
        
        

        slider = new JSlider(min, max, value);
        slider.addChangeListener( new ChangeListener()
            {
                public void stateChanged(ChangeEvent e)
                {
                    int v = slider.getValue();
                    model.setNumNodes(v);

                }

            }
        );
        
        slider.setPaintTicks(true);
	slider.setMajorTickSpacing( ((max - min)/10) );
	slider.setPaintLabels(true);
	slider.setLabelTable( slider.createStandardLabels((max - min)/10) );

        

        setLayout(new BorderLayout());
        add(number, BorderLayout.WEST);
        add(slider, BorderLayout.CENTER);
    }

    /**
    Updates the slider when the number of nodes changes
    @param obs an Observable object
    @param obj an Object object
    */
    public void update(Observable obs, Object obj)
    {
        slider.setValue(model.getNumNodes());
    }
}
