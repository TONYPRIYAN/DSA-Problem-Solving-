class Solution {
    public int minimumCost(int[] cost) 
    {
        int tot = 0;

        Arrays.sort(cost);

        int k =0;
        for(int i=cost.length -1;i>=0;i--)
        {
            if(k < 2)
            {
                tot += cost[i];
                k++;
            }
            else
            {
                k=0;
            }

        }

        return tot;
        
    }
}