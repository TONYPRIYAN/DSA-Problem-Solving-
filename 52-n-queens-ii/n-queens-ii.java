class Solution {
    int ans = 0;
    public int totalNQueens(int n) 
    {
        
        char[][] board = new char[n][n];
       

        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],'.');
        }

        solve(0,board,n);

        return ans;
        
    }




public boolean issafe(int row,int col,char[][] board,int n)
{
    for(int j=0;j<col;j++)
    {
        if(board[row][j] == 'Q') return false;
    }

    for(int i=row,j=col;i>=0 && j>=0;i--,j--)
    {
        if(board[i][j] == 'Q') return false;
    }

    for(int i=row,j=col;i<n&& j>=0;i++,j--)
    {
        if(board[i][j] == 'Q') return false;
    }

    return true;

}

    public void solve(int col,char[][] board,int n)
    {
        if(col == n)
        {
            ans++;
            return;
        }

        for(int row = 0;row<n;row++)
        {
            if(issafe(row,col,board,n))
            {
                board[row][col] = 'Q';
                solve(col+1,board,n);
                board[row][col] = '.';

            }

        }


    }

    
}
