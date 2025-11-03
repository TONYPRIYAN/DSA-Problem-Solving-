class Solution {
    public int minCost(String colors, int[] neededTime) 
    {

        int sec = 0;
        int tot = neededTime[0];

        for(int i=1;i<colors.length();i++)
        {
            if(colors.charAt(i) == colors.charAt(i-1))
            {
                sec += Math.min(tot,neededTime[i]);

                tot = Math.max(tot,neededTime[i]);
            }
            else
            {
                tot = neededTime[i];
            }
        }

        return sec;
        
    }
}