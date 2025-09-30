class Solution {


    public int findCircleNum(int[][] mat)
    {
        int[] vis = new int[mat.length];

        int count = 0;

        for(int i=0;i<mat.length;i++)
        {
            if(vis[i] == 0)
            {
                dfs(mat,vis,i);
                count++;
            }
        }

        return count;
    }

    public void dfs(int[][] mat,int[] vis,int i)
    {
        for(int j=0;j<mat.length;j++)
        {
            if(mat[i][j] == 1 && vis[j] == 0)
            {
                vis[j] = 1;
                dfs(mat,vis,j);
            }
        }
    }
}