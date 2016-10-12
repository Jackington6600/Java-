
/**
A game of minesweeper
*/
public class MineSweeper
{
    public static final int BLANK = -1;
    public static final int MINE = -2;
    public static final int FOUND_MINE = -3;
    public static final int EASY = 10;
    public static final int MEDIUM = 15;
    public static final int HARD = 20;
    
    private int[][] board;
    private int difficulty = MEDIUM;
    
    
    /**
    Creates a game of minesweeper in a 10x10 grid using the current difficulty setting (default medium)
    */
    public MineSweeper()
    {
        board = new int[10][10];
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                board[i][j] = BLANK;
                
            }
        }     
        placeMines(difficulty);
    }
    
    /**
    Private method to place mines using a set difficulty
    @param difficulty the difficulty
    */
    private void placeMines(int difficulty)
    {
        for(int i = 0; i < difficulty; i++)
        {
            boolean minePlaced = false;
            while(minePlaced == false)
            {
                int x = (int)(Math.random() * 10);
                int y = (int)(Math.random() * 10);
                
                if(board[x][y] == BLANK)
                {
                    board[x][y] = MINE;
                    minePlaced = true;
                }
            }
        }
    }
    
    /**
    Sets the difficulty
    @param difficulty the difficulty
    */
    public void setDifficulty(int difficulty)
    {
        this.difficulty = difficulty;
    }
    
    /**
    Returns the current difficulty setting
    @return the difficulty
    */
    public int getDifficulty()
    {
        return difficulty;
    }
    
    /**
    Gets the value at a given index of the 2D array
    @param i the row
    @param j the column
    @return the value at that index (as an integer)
    */
    public int get(int i, int j)
    {
        return board[i][j];
    }
    
    /**
    The method that decides what happens when a button (at a given index) is clicked
    @param i the row
    @param j the column
    */
    public void isClicked(int i, int j)
    {
        if(board[i][j] == BLANK)
        {
            int counter = 0;
        
            if((i-1) >= 0 && (j-1) >= 0 && (board[i-1][j-1] == MINE || board[i-1][j-1] == FOUND_MINE))
                counter++;
            if((i-1) >= 0 && (board[i-1][j] == MINE || board[i-1][j] == FOUND_MINE))
                counter++;
            if((i-1) >= 0 && (j+1) < 10 && (board[i-1][j+1] == MINE || board[i-1][j+1] == FOUND_MINE))
                counter++;
            if((j-1) >= 0 && (board[i][j-1] == MINE || board[i][j-1] == FOUND_MINE))
                counter++;
            if((j+1) < 10 && (board[i][j+1] == MINE || board[i][j+1] == FOUND_MINE))
                counter++;
            if((i+1) <10 && (j-1) >= 0 && (board[i+1][j-1] == MINE || board[i+1][j-1] == FOUND_MINE))
                counter++;
            if((i+1) < 10 && (board[i+1][j] == MINE || board[i+1][j] == FOUND_MINE))
                counter++;
            if((i+1) < 10 && (j+1) < 10 && (board[i+1][j+1] == MINE || board[i+1][j+1] == FOUND_MINE))
                counter++;

            board[i][j] = counter;
        }
        else if(board[i][j] == MINE)
        {
            board[i][j] = FOUND_MINE;
        }
        
    }
    
    /**
    The method for when a mine is clicked
    */
    public void mineClicked()
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                isClicked(i, j);
            }
        }
    }
    
    /**
    Starts a new game based on the current difficulty setting
    @param difficulty the difficulty setting
    */
    public void newGame(int difficulty)
    {
        
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                board[i][j] = BLANK;
                
            }
        }     
        placeMines(difficulty);
    }
}