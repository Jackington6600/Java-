import javax.swing.JFrame;
public class VirusViewer
{

	public static void main(String[] args)
	{
		
		
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setTitle("Virus Viewer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
                Population pop1 = new Population(1000, 0.5, 0.5, 0.4);
		
                int updates = 1000;
                
                double[] virusArray = new double[updates];
                for(int i = 0; i < updates; i++)
                {
                    virusArray[i] = pop1.proportionInfected();
                    pop1.update();
                }
                
		VirusComponent comp = new VirusComponent(400, virusArray);
		frame.add(comp); 
		
		
		frame.setVisible(true);
	}
}