import java.util.Observable;
import java.awt.geom.Point2D;

/**
Model of the Spatial Network
*/
public class SpatialModel extends Observable
{
    private SpatialNetwork spatialNet;

    /**
    Creates a model of the Spatial Network
    @param spatialNet the Spatial Network
    */
    public SpatialModel(SpatialNetwork spatialNet)
    {
        super();
        this.spatialNet = spatialNet;
    }

    /**
    Gets the node at a given index
    @param i the index
    @return the node
    */
    public Point2D.Double getNode(int i)
    {
	return spatialNet.getNode(i);
    }
    
    /**
    Gets the number of nodes
    @return the number of nodes
    */
    public int getNumNodes()
    {
        return spatialNet.getNumNodes();
    }
    
    /**
    Gets the threshold
    @return the threshold
    */
    public double getThreshold()
    {
        return spatialNet.getThreshold();
    }
    
    /**
    Checks if 2 given nodes are within the threshold
    @param a the first node
    @param b the second node
    @return true if they are within the threshold, else false
    */
    public boolean connected(Point2D.Double a, Point2D.Double b)
    {
        return spatialNet.connected(a, b);
    }
    
    /**
    Sets the threshold to a new given value
    @param threshold the new threshold
    */
    public void setThreshold(double threshold)
    {
        spatialNet.setThreshold(threshold);
        setChanged();
        notifyObservers();
    }
    
    /**
    Sets the number of nodes and randomly re-plots the nodes.
    @param numNodes the number of nodes
    */
    public void setNumNodes(int numNodes)
    {
        spatialNet.setNumNodes(numNodes);
        setChanged();
        notifyObservers();
    }
}