class Solution {
    public boolean increasingTriplet(int[] nums) 
    {
        int l  = Integer.MAX_VALUE;
        int r = Integer.MAX_VALUE;

        for(int n : nums)
        {
            if(n <= l)
            {
                l = n;
            }
            else if(n <= r)
            {
                r = n;
            }
            else
            {
                return true;
            }
        }

        return false;
        
    }
}