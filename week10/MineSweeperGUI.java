import javax.swing.JFrame;


/**
GUI for the minesweeper game
*/
public class MineSweeperGUI extends JFrame
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("MineSweeper");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MineSweeper mine = new MineSweeper();
	
		MineComponent panel = new MineComponent(mine);

		frame.add(panel);
		
		frame.setVisible(true);
	}
}
