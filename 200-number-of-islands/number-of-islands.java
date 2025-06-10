class Solution {
    char[][] graph;
    public int numIslands(char[][] grid) 
    {
        int island = 0;
        graph = grid;
        for(int i=0;i<graph.length;i++)
        {
        for(int j=0;j<graph[i].length;j++)
        {
            island += traverse(i,j);
        }
        }
        return island;
    }

    public  int traverse(int i,int j)
    {
        if(i < 0 || i == graph.length || j < 0 || j == graph[i].length || graph[i][j] == '0')
        return 0;
        graph[i][j] = '0';
        traverse(i+1,j);
        traverse(i-1,j);
        traverse(i,j+1);
        traverse(i,j-1);

        return 1;
    }
}