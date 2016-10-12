import java.util.ArrayList;
import java.awt.geom.Point2D;

/**
With a given number of randomly plotted nodes, nodes are connected by a line if they are within the threshold of each other.
*/
public class SpatialNetwork
{
    private int numNodes;
    private double threshold;
    private ArrayList<Point2D.Double> nodes;
    
    /**
    Create a Spatial Network with a given number of nodes (which get randomly plotted) and the threshold
    @param numNodes the number of nodes
    @param threshold the threshold
    */
    public SpatialNetwork(int numNodes, double threshold)
    {
        this.numNodes = numNodes;
        this.threshold = threshold;
        nodes = new ArrayList<Point2D.Double>();
        calculateNodes();
        
    }
    
    /**
    Calculates where the nodes will be plotted
    */
    private void calculateNodes()
    {
        nodes.clear();
        for(int i = 0; i < numNodes; i++)
        {
            double r = Math.random();
            double x = r;
            r = Math.random();
            double y = r;
            
            nodes.add(new Point2D.Double(x, y));
            
        }
    }
    
    /**
    Gets the node at the given index in the array
    @param i the index of the point
    @return the node
    */
    public Point2D.Double getNode(int i)
    {
	return nodes.get(i);
    }
    
    /**
    Gets the number of nodes
    @return the number of nodes
    */
    public int getNumNodes()
    {
        return numNodes;
    }
    
    /**
    Gets the threshold
    @return the threshold
    */
    public double getThreshold()
    {
        return threshold;
    }
    
    /**
    Checks if 2 given nodes are within the threshold of each other
    @param a the first node
    @param b the second node
    @return true if they are within the threshold, else false
    */
    public boolean connected(Point2D.Double a, Point2D.Double b)
    {
        double ax = a.getX();
        double ay = a.getY();
        double bx = b.getX();
        double by = b.getY();
        
        double distance = Math.sqrt( (ax - bx)*(ax - bx) + (ay - by)*(ay - by) );
        
        if(distance <= threshold)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
    Sets the threshold to a given value
    @param threshold the new threshold
    */
    public void setThreshold(double threshold)
    {
        this.threshold = threshold;
    }
    
    /**
    Sets the number of nodes and randomly re-plots the nodes.
    @param numNodes the number of nodes
    */
    public void setNumNodes(int numNodes)
    {
        this.numNodes = numNodes;
        calculateNodes();
    }
}