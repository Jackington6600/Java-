import javax.swing.JFrame;

public class EasterGUI
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Easter Sunday Calculator");
		frame.setSize(250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Easter easter = new Easter(2000);
		
		EasterComponent panel = new EasterComponent(easter, 1800, 2200, 2000);

		frame.add(panel);
		
		frame.setVisible(true);
	}
}