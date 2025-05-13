class Solution {
    public int maxProfit(int[] prices) 
    {
        int min = prices[0];
        int prof = 0;

        for(int i=0;i<prices.length;i++)
        {
            min = Math.min(min,prices[i]);
            prof = Math.max(prof,prices[i]-min);
        }

    return prof;
        
    }
}