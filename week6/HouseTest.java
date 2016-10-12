import javax.swing.JFrame;
public class HouseTest
{

	public static void main(String[] args)
	{
		
		
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setTitle("Q1 and Q2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HouseComponent house1 = new HouseComponent(100, 100, 100);
		frame.add(house1);
                
                
                JFrame frame2 = new JFrame();
		frame2.setSize(1000, 400);
		frame2.setTitle("Qusetion 3");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                StreetComponent houses = new StreetComponent(100, 100, 100, 5);
		frame2.add(houses);
		
		frame2.setVisible(true);
		frame.setVisible(true);
                
	}
}
