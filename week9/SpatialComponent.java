import javax.swing.JPanel;
import java.awt.BorderLayout;

/**
A panel that displays the view, the NumberPanel, the ThresholdPanel and the ButtonPanel
 */
public class SpatialComponent extends JPanel
{
    /**
    Creates the panel
    @param spatialNet the Spatial Network
    */
    public SpatialComponent(SpatialNetwork spatialNet)
    {
        super();

        SpatialModel model = new SpatialModel(spatialNet);
        SpatialView view = new SpatialView(model);

        ThresholdPanel threshold = new ThresholdPanel(model, 0, 100, 20);
        NumberPanel number = new NumberPanel(model, 0, 200, 50);
        ButtonPanel button = new ButtonPanel(model);

        model.addObserver(view);
        model.addObserver(number);
        model.addObserver(threshold);


        setLayout(new BorderLayout());
        add(threshold, BorderLayout.SOUTH);
        add(number, BorderLayout.NORTH);
        add(view, BorderLayout.CENTER);
        add(button, BorderLayout.EAST);
    }
}
