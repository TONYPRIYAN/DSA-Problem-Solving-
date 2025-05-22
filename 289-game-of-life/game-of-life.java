class Solution 
{
    public void gameOfLife(int[][] board) 
    {  
        int rows = board.length;
       int cols = board[0].length;

       
        int[][] dirs = {
            {-1, -1}, {-1, 0}, {-1, 1},
            { 0, -1},          { 0, 1},
            { 1, -1}, { 1, 0}, { 1, 1}
        };

        for(int r = 0;r<rows;r++)
        {
            for(int c=0;c<cols;c++)
            {
                int liveneigh = 0;
                for(int[] dir: dirs)
                {
                    int nr = r+dir[0];
                    int nc = c+dir[1];

                    if(nr >= 0 && nr < rows && nc >=0 && nc < cols)
                    {
                        int neigh= board[nr][nc];
                        if(neigh == 1 || neigh ==2)
                        {
                            liveneigh++;
                        }
                    }
                }
                    if(board[r][c] == 1)
                    {
                        if(liveneigh < 2 || liveneigh > 3)
                        {
                            board[r][c] = 2;
                        }
                    }
                    else if(board[r][c] == 0)
                    {
                        if(liveneigh == 3)
                        {
                            board[r][c] = 3;
                        }
                    }
                
            }
        }

        for(int r = 0;r<rows;r++)
        {
            for(int c=0;c<cols;c++)
            {
                board[r][c] %= 2;
            }
        }
    }
}
