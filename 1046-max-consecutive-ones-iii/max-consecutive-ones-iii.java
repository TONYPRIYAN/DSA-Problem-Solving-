class Solution {
    public int longestOnes(int[] nums, int k)
    {
        int l = 0;
        int r = 0;
        int n = nums.length;
        int zeros = 0;
        int max = 0;

        while(r < n)
        {
            if(nums[r] == 0)
            {
                zeros++;
            }

            while(zeros > k)
            {
                if(nums[l] == 0)
                {
                    zeros--;
                }
                l++;
            }

            if(zeros <= k)
            {
                int len = r - l + 1;
                max = Math.max(max,len);
            }
            r++;
        }

        return max;
    }
}