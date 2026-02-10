class Solution {
    public int[] runningSum(int[] nums) 
    {
        int sum = 0;
        for(int x : nums)
        {
            sum += x;
        }

        int n = nums.length-1;
        for(int i=n;i>=0;i--)
        {
            int rem = sum-nums[i];
            nums[i] = sum;
            sum = rem;
        }

        return nums;

    }
}