class Solution {
    public void moveZeroes(int[] nums) 
    {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                k++;
            }
            else if(k>0)
            {
                int m = nums[i];
                nums[i] = 0;
                nums[i-k] = m;
            }
        }

    }
}