import javax.swing.JPanel;
import java.awt.event.*;
import javax.swing.JButton;
import java.awt.FlowLayout;

/**
A panel to display a reset and an exit button
 */
public class ButtonPanel extends JPanel
{
    SpatialModel model;
    JButton reset;
    JButton exit;
    
    /**
    Creates the reset button and the exit button and places them both on the panel
    @param model the model
    */
    public ButtonPanel(SpatialModel model)
    {
        super();

        this.model = model;

        

        reset = new JButton("Reset");
        reset.addActionListener( new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    
                    model.setThreshold(0.2);
                    model.setNumNodes(50);

                }

            }    
        );
        
        exit = new JButton("Exit");
        exit.addActionListener(e -> System.exit(0));

        

        setLayout(new FlowLayout());
        add(reset);
        add(exit);
        
    }

}