class Solution {

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

    public void solve(int col,List<List<String>> ans,char[][] board,int n)
    {
        if(col == n)
        {
            List<String> list = new ArrayList<>();
            for(int i=0;i<col;i++)
            {
                list.add(new String(board[i]));
            }
            ans.add(list);
            return;
        }

        for(int row = 0;row<n;row++)
        {
            if(issafe(row,col,board,n))
            {
                board[row][col] = 'Q';
                solve(col+1,ans,board,n);
                board[row][col] = '.';

            }

        }


    }



    public List<List<String>> solveNQueens(int n) 
    {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],'.');
        }

        solve(0,ans,board,n);

        return ans;
        
    }
}