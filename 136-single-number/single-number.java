class Solution {
    public int singleNumber(int[] nums) 
    {
        int val = 0;
        for(int x : nums)
        {
            val ^= x;
        }
        return val;
        
    }
}