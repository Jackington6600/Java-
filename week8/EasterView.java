import javax.swing.JLabel;
import java.util.Observer;
import java.util.Observable;

public class EasterView extends JLabel implements Observer
{
	private EasterModel model;
	
	public EasterView(EasterModel model)
	{
		super();
		this.model = model;
		
		int year = (int)(model.getYear());
                int day = (int)(model.getDay());
                String month = model.getMonth();
		setText("In the year " + year + " Easter is on " + day + " " + month);
	}

	public void update(Observable obs, Object obj)
	{
		int year = (int)(model.getYear());
                int day = (int)(model.getDay());
                String month = model.getMonth();
		setText("In the year " + year + " Easter is on " + day + " " + month);
	}

}