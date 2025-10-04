class Solution {

    boolean found = false;
    public boolean validPath(int n, int[][] edges, int source, int dest) 
    {
        if(source == dest) 
            return true;

        HashMap<Integer,List<Integer>> map = new HashMap<>();
        boolean[] vis = new boolean[n];

        for(int i=0;i<n;i++)
        {
            map.put(i,new ArrayList<>());
        }

        for(int[] e : edges)
        {
            map.get(e[0]).add(e[1]);
            map.get(e[1]).add(e[0]);
        }

        dfs(map,vis,source,dest);
        return found;
        
    }

    public void dfs(HashMap<Integer,List<Integer>> map,boolean[] vis,int source, int dest)
    {
        if(vis[source] || found)
            return;

        vis[source] = true;

        for(int n : map.get(source))
        {
            if(n == dest)
            {
                found = true;
                break;
            }

            if(!vis[n])
            {
                dfs(map,vis,n,dest);
            }
        }
    }
}