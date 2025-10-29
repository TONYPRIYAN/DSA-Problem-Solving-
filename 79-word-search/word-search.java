class Solution {
    public boolean exist(char[][] board, String word) 
    {
        int m = board.length;
        int n = board[0].length;

        int k = 0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j] == word.charAt(k))
                {
                    if(search(board,word,m,n,i,j,k))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
        
    }

    public boolean search(char[][] board, String word,int m,int n,int r,int c,int k)
    {

        if(k == word.length())
        {
            return true;
        }

        if(r < 0 || c < 0 ||r == m || c == n || board[r][c] != word.charAt(k) || board[r][c] == '!')
        {
            return false;
        }

        char ch = board[r][c];
        board[r][c] = '!';


        boolean top = search(board,word,m,n,r-1,c,k+1);
                
        boolean right = search(board,word,m,n,r,c+1,k+1);

        boolean bottom = search(board,word,m,n,r+1,c,k+1);

        boolean left = search(board,word,m,n,r,c-1,k+1);

        board[r][c] = ch;

        return top || right || bottom || left;


    }
}