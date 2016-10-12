/**
Assesses whether signal strength is good or bad across a map.
*/

public class SignalMap
{
	private boolean[][] map;
        private double threshold;
        private Network network;
        private int size;
        
	
	/**
	Create a signal map that indicates whether the signal strength is above the threshold.
        @param threshold The number below which signal strength will be considered bad.
        @param size The size of the 2D array dimensions: (size x size).
        @param network The chosen network to use for the Signal Map.
        
	*/
	public SignalMap(double threshold, int size, Network network)
	{
            this.threshold = threshold;
            this.size = size;
            this.map = new boolean[size][size];
            this.network = network;
            
            
            
            for(int i = 0; i < size; i++)
            {			
                for(int j = 0; j < size; j++)
                {
                    if(network.getSignal(j, i) < threshold) 
                    /**
                    * In "getSignal(j, i)" j and i are in this order throughout because j effects the x-axis, therefore effects the column.
                    * i effects the y-axis, therefore effects the row. This order ensures that the display has the correct orientation.
                    */
                    {
                        map[i][j] = true;
                    }
                    else
                    {
                        map[i][j] = false;
                    }
                }
            }

	}
        
        /**
        Method to display the SignalMap.
        Prints an "X" where there is a signal below the threshold.
        */

        public void display()
        {
            for(int i = 0; i < size; i++)
            {	
                
                for(int j = 0; j < size; j++)
                {
                    if(map[i][j])
                    {
                        System.out.print("X");
                    }
                    else
                    {
                        System.out.print("-");
                    }
                    
                }
                System.out.println("");
                
            }      
            
        }
        
        /**
        Calculates the ratio of areas with a bad signal to areas with good signal.
        @return The ratio of bad signal to good signal.
        */
        
        public double poorSignal()
        {
            double countT = 0.0;
            double countF = 0.0;
            for(int i = 0; i < size; i++)
            {	
                for(int j = 0; j < size; j++)
                {
                    if(map[i][j])
                    {
                        countT = countT + 1.0;
                    }
                    else
                    {
                        countF = countF + 1.0;
                    }
                }
            }
            double result = countT/(countT + countF);
            return result;
        }
        
        /**
        Finds the transmitter in the network that contributes the most to the coverage.
        @return The transmitter contributing the most to the coverage.
        */
        
        public Transmitter important()
        {
            Transmitter bigEffect = network.getTransmitter(0);
            double biggest = 0.0;
            for(int j = 0; j < network.size(); j++)
            {
                Network net1 = new Network();
                
                
                for(int i = 0; i < network.size(); i++)
                {
                    if(i!=j)
                    {
                    net1.add(network.getTransmitter(i));
                    }
                }
                SignalMap sig1 = new SignalMap(threshold, size, net1);
                //sig1.display();
                
                if(sig1.poorSignal() > biggest)
                {
                    biggest = sig1.poorSignal();
                    bigEffect = network.getTransmitter(j);
                }
            }
            System.out.print("Most important in network: ");
            return bigEffect;
        }
        
        /**
        Marks the areas in which the new network contributes a better signal than the original network.
        @param netInput The new network.
        */
        
        public void compare(Network netInput)
        {
            System.out.println("");
            
            for(int i = 0; i < size; i++)
            {			
                for(int j = 0; j < size; j++)
                {
                    if(netInput.getSignal(j, i) > network.getSignal(j, i))
                    {
                        System.out.print("X");
                    }
                    else
                    {
                        System.out.print("-");
                    }
                }
                System.out.println("");
            }
            
            
            
            
            
        }
}