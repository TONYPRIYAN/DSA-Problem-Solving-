class Solution {
    public boolean increasingTriplet(int[] nums)
    {
        int l = Integer.MAX_VALUE;
        int r = Integer.MAX_VALUE;

        for(int num : nums)
        {
            if(num <= l)
            {
                l = num;
            }
            else if(num <= r)
            {
                r = num;
            }
            else
            {
                return true;
            }
        }

        return false;
        
    }
}