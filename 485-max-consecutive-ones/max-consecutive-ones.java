class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int max = 0;
        int k = 0;
        for(int x : nums)
        {
            if(x == 1)
            {
                k++;
            }
            else
            {
                max = Math.max(max,k);
                k=0;
            }
        }
        return Math.max(max,k);
        
    }
}