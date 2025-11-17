class Solution {
    public boolean kLengthApart(int[] nums, int k) 
    {

        int ind = -1;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 1)
            {

            
            if(ind != -1 && (i - ind - 1) < k)
            {
                return false;
            }

            ind  = i;
            }
        }

        return true;

        
    }
}