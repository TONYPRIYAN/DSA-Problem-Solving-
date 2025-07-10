class Solution {
    public int longestSubarray(int[] nums) 
    {
        int l = 0;
        int r = 0;
        int n = nums.length;
        int max = 0;
        int zeros = 0;
        int zcount = 0;

        while(r < n)
        {
            if(nums[r] == 0)
            {
                zeros++;
                zcount++;
            }

            while(zeros > 1)
            {
                if(nums[l] == 0)
                {
                    zeros--;
                }
                l++;
            }

            if(zeros <= 1)
            {
                int len = r - l;
                max = Math.max(max,len);
            }

            r++;
        }

        if(zcount == 0)
        {
            return n-1;
        }
        else
        {
            return max;
        }
        
    }
}