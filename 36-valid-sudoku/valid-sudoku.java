class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        Set seen  = new HashSet();

        for(int i=0;i<9;++i)
        {
            for(int j=0;j<9;++j)
            {
                char number = board[i][j];
                if(number != '.')
                {
                    if(!seen.add(number+"r"+i) || !seen.add(number+"c"+j) || !seen.add(number+"b"+(i/3)+"-"+(j/3)))
                    {
                        return false;
                    }
                }
            }
        }

        return true;

        
    }
}