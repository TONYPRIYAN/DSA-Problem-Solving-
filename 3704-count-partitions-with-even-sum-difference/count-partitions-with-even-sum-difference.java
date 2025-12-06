class Solution {
    public int countPartitions(int[] nums) 
    {
        int sum = 0;

        for(int x : nums)
        {
            sum+=x;
        }

        int sum2 = 0;
        int count =0;
        for(int i=0;i<nums.length-1;i++)
        {
            sum2 += nums[i];
            int rem = sum-sum2;
            if((sum2 - rem)%2 == 0) count++;

        }

        return count;
        
    }
}