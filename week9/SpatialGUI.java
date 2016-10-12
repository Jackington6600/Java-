import javax.swing.JFrame;

/**
GUI for the Spatial Network
 */
public class SpatialGUI
{

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Spatial Network");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SpatialNetwork network = new SpatialNetwork(50, .2);

        SpatialComponent panel = new SpatialComponent(network);

        frame.add(panel);

        frame.setVisible(true);
    }
}