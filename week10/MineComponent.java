import javax.swing.JPanel;
import java.awt.BorderLayout;

/**
A panel that contains the BoardView and the ControlPanel
*/
public class MineComponent extends JPanel
{
        /**
        Creates the MineModel, the BoardView and the ControlPanel and adds them to the panel
        @param mine the minesweeper game
        */
	public MineComponent(MineSweeper mine)
	{	
		super();
		MineModel model = new MineModel(mine);
		
		BoardView board = new BoardView(model);
                ControlPanel control = new ControlPanel(model);

		model.addObserver(board);	
	
		setLayout(new BorderLayout());
		add(board, BorderLayout.CENTER);
		add(control, BorderLayout.SOUTH);
			
	}
}
