import javax.swing.JPanel;
import java.awt.BorderLayout;

public class NoughtsCrossesComponent extends JPanel
{
	public NoughtsCrossesComponent(NoughtsCrosses noughtsCrosses)
	{	
		super();
		NoughtsCrossesModel model = new NoughtsCrossesModel(noughtsCrosses);
		
		ButtonPanel button = new ButtonPanel(model);
		BoardView board = new BoardView(model);

		model.addObserver(board);	
	
		setLayout(new BorderLayout());
		add(button, BorderLayout.SOUTH);
		add(board, BorderLayout.CENTER);
		
			
	}
}
