public class Test
{
	public static void main(String[] args)
	{
		Transmitter t1 = new Transmitter(1.0, 0.5, 80.0);
		Transmitter t2 = new Transmitter(8.0, 1.2, 80.0);
		Transmitter t3 = new Transmitter(17.5, 17.0, 80.0);
		 
		Network net = new Network();
		net.add(t1);
		net.add(t2);
		net.add(t3);

		double x1 = 5.0;
		double y1 = 2.0;
		
		double x2 = 3.5;
		double y2 = 18.0;
		
		SignalStrength grid = new SignalStrength(net, 20);
		System.out.println(grid.averageSignal());
                
                SignalMap signal = new SignalMap(1.0, 20, net);
                //signal.();
                signal.display();
                
                System.out.println(signal.poorSignal());
                System.out.println(signal.important());
                
                Transmitter t4 = new Transmitter(3.0, 2.5, 80.0);
		Transmitter t5 = new Transmitter(1.0, 10.2, 80.0);
		Transmitter t6 = new Transmitter(1.5, 19.0, 80.0);
                
                Network net2 = new Network();
		net2.add(t4);
		net2.add(t5);
		net2.add(t6);
                
                signal.compare(net2);
                
                
                
                
            
	
	}
}