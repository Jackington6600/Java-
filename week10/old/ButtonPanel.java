import javax.swing.JPanel;
import javax.swing.JButton;


public class ButtonPanel extends JPanel
{

	public ButtonPanel(NoughtsCrossesModel model)
	{
		super();

		JButton newGame = new JButton("New Game");
		newGame.addActionListener( e -> model.newGame() );

		JButton exit = new JButton("Exit");
		exit.addActionListener( e -> System.exit(0) );

		add(newGame);
		add(exit);
	}
}
		
