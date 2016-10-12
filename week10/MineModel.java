import java.util.Observable;

/**
A model of the minesweeper game
*/
public class MineModel extends Observable
{
    private MineSweeper mine;
    
    /**
    Creates a model of the game of minesweeper
    @param mine the game of minesweeper
    */
    public MineModel(MineSweeper mine)
    {
        super();
        this.mine = mine;
    }
    
    /**
    Sets the difficulty (notifies observers)
    @param difficulty the difficulty
    */
    public void setDifficulty(int difficulty)
    {
        mine.setDifficulty(difficulty);
        setChanged();
        notifyObservers();
    }
    
    /**
    Returns the current difficulty setting
    @return the difficulty
    */
    public int getDifficulty()
    {
        return mine.getDifficulty();
    }
    
    /**
    Gets the value at a given index of the 2D array
    @param i the row
    @param j the column
    @return the value at that index (as an integer)
    */
    public int get(int i, int j)
    {
        return mine.get(i, j);
    }
    
    /**
    The method that decides what happens when a button (at a given index) is clicked (notifies observers)
    @param i the row
    @param j the column
    */
    public void isClicked(int i, int j)
    {
        mine.isClicked(i, j);
        setChanged();
	notifyObservers();
    }
    
    /**
    The method for when a mine is clicked
    */
    public void mineClicked()
    {
        mine.mineClicked();
    }
    
    /**
    Starts a new game based on the current difficulty setting (notifies observers)
    @param difficulty the difficulty setting
    */
    public void newGame(int difficulty)
    {
        mine.newGame(difficulty);
        setChanged();
	notifyObservers();
    }
}