class Solution {
    public int findCenter(int[][] edges) 
    {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<edges.length;i++)
        {
            //map.getOrDefault(edges[i][0],0)
            map.put(edges[i][0],map.getOrDefault(edges[i][0],0)+1);
            map.put(edges[i][1],map.getOrDefault(edges[i][1],0)+1);

        }


        for(int k : map.keySet())
        {
            if(map.get(k) == edges.length)
            {
                return k;
            }
        }

        return 0;
        
    }
}