class Solution {
    public int numberOfSubarrays(int[] nums, int k) 
    {
        return atmost(nums,k) - atmost(nums,k-1);
        
    }

    int atmost(int[] nums,int k)
    {
        int count = 0;
        int l = 0;

        for(int r = 0;r<nums.length;r++)
        {
            if(nums[r]%2 == 1)
            {
                k--;
            }

            while(k<0)
            {
                if(nums[l]%2 == 1)
                {
                    k++;
                }
                l++;
            }

            count += (r-l+1);


        }

        return count;

    }
}