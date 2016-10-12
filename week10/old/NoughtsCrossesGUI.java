import javax.swing.JFrame;
	
public class NoughtsCrossesGUI extends JFrame
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Noughts and Crosses");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NoughtsCrosses oxo = new NoughtsCrosses();
	
		NoughtsCrossesComponent panel = new NoughtsCrossesComponent(oxo);

		frame.add(panel);
		
		frame.setVisible(true);
	}
}
