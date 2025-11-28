class Solution {
    public int findDuplicate(int[] nums) 
    {

        for(int x : nums)
        {
            int i = Math.abs(x);

            if(nums[i] < 0)
            {
                return i;
            }

            nums[i] = -nums[i];
        }

        return 0;
        
    }
}