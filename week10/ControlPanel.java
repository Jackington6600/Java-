import javax.swing.JPanel;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;

/**
Creates a Control Panel that has radio buttons to select a difficulty, a reveal button, an exit button and a new game button
*/
public class ControlPanel extends JPanel 
{
    MineModel model;
    JButton reset;
    JButton exit;
    JButton reveal;
    JRadioButton easy;
    JRadioButton med;
    JRadioButton hard;
    
    /**
    Creates the panel
    @param model the model of the minesweeper game
    */
    public ControlPanel(MineModel model)
    {
        super();
        
        this.model = model;
        
        reset = new JButton("New Game");
        reset.addActionListener(e -> model.newGame(model.getDifficulty()));
        
        exit = new JButton("Exit");
        exit.addActionListener(e -> System.exit(0));
        
        reveal = new JButton("Reveal");
        reveal.addActionListener( new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    
                    for(int x = 0; x < 10; x++)
                    {
                        for(int y = 0; y < 10; y++)
                        {
                            model.isClicked(x ,y);
                        }
                    }

                }

            });

        easy = new JRadioButton("Easy", false);
        easy.addActionListener(e -> model.setDifficulty(MineSweeper.EASY));
        
        med = new JRadioButton("Medium", true);
        med.addActionListener(e -> model.setDifficulty(MineSweeper.MEDIUM));
        
        hard = new JRadioButton("Hard", false);
        hard.addActionListener(e -> model.setDifficulty(MineSweeper.HARD));
        
        ButtonGroup group = new ButtonGroup();
        
        group.add(easy);
        group.add(med);
        group.add(hard);
        
        setLayout(new FlowLayout());
        add(easy);
        add(med);
        add(hard);
        add(reveal);
        add(reset);
        add(exit);
    }
    
}