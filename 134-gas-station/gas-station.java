class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int gassum = 0;
        int costsum = 0;

        for(int i=0;i<gas.length;i++)
        {
            gassum+=gas[i];
            costsum+=cost[i];
            gas[i] = gas[i]-cost[i];
        }

        if(gassum < costsum)
        {
            return -1;
        }
       
       int tot = 0;
       int start = 0;
        for(int i=0;i<gas.length;i++)
        {
            tot += gas[i];
            if(tot < 0)
            {
                tot = 0;
                start = i+1;

            }
            
        }
        return start;
        
    }
}