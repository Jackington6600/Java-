
import javax.swing.JButton;
import java.util.Observer;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.util.Observable;
import java.awt.GridLayout;

/**
The view of the minesweeper game
*/
public class BoardView extends JPanel implements Observer
{
    
    private MineModel model;
    private JButton[][] cell;
    
    /**
    Creates the Board View using the model of the minesweeper game including the buttons used to interact with the game
    @param model 
    */
    public BoardView(MineModel model)
    {
        super();
        this.model = model;
        
        cell = new JButton[10][10];
        
        setLayout(new GridLayout(10,10));
        
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                cell[i][j] = new JButton(" ");
                final int x = i;
                final int y = j;
                cell[i][j].addActionListener( e -> model.isClicked(x, y) );
                add(cell[i][j]);
            }
        }
    }
    
    /**
    Decides what happens when buttons in the grid are clicked/not clicked and repaints the grid
    @param obs an Observable object
    @param obj an Object object
    */
    public void update(Observable obs, Object obj)
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                if(model.get(i, j) == MineSweeper.BLANK)
                {
                    cell[i][j].setText(" ");
                    cell[i][j].setEnabled(true);
                }
                else if(model.get(i, j) == MineSweeper.MINE)
                {
                    cell[i][j].setText(" ");
                    cell[i][j].setEnabled(true);
                }
                else if(model.get(i, j) == MineSweeper.FOUND_MINE)
                {
                    cell[i][j].setText("X");
                    cell[i][j].setEnabled(false);
                    for(int x = 0; x < 10; x++)
                    {
                        for(int y = 0; y < 10; y++)
                        {
                            model.mineClicked();
                            cell[x][y].setEnabled(false);
                            if(model.get(x, y) == -3)
                            {
                                cell[x][y].setText("X");
                            }
                            else
                            {
                                cell[x][y].setText(model.get(x, y) + "");
                            }
                        }
                    }
                }
                else
                {
                    cell[i][j].setText(model.get(i, j) + "");
                    cell[i][j].setEnabled(false);
                }
            }
        }
        repaint();	
    }
}