class Solution {
    public int uniquePaths(int m, int n) 
    {
        int[][] grid = new int[m][n];

        for(int[] x : grid)
        {
            Arrays.fill(x,-1);
        }

        return findpath(m-1,n-1,grid);
        
    }

    public int findpath(int i,int j,int[][] grid)
    {

        if(i == 0 && j == 0) return 1;

        if(i< 0 || j<0) return 0;

        if(grid[i][j] != -1) return grid[i][j];

        int up = findpath(i-1,j,grid);
        int left = findpath(i,j-1,grid);


        return grid[i][j] = up + left;
    }
}