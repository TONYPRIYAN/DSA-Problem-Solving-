class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        if(nums.length == 0)
        {
            return 0;
        }

    int l = 0;
    int r  = 0;
    int sum = 0;
    int min = Integer.MAX_VALUE;


    while(r < nums.length)
    {
        sum += nums[r++];

        while(sum >= target)
        {
            min = Math.min(min,r-l);
            sum -= nums[l];
            l++;
        }
    }

    return min == Integer.MAX_VALUE ? 0 : min;
        
    }
}