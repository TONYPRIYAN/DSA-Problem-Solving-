class Solution {
    public int singleNonDuplicate(int[] nums) 
    {
        int  l = 1;
        int  r = nums.length -2;
        int single = 0;

        if(nums.length == 1)
        return nums[0];

        if(nums[0] != nums[1])
        return nums[0];

        if(nums[nums.length -1] != nums[nums.length -2])
        return nums[nums.length -1];

        while(l <= r)
        {
            int mid  = (l+r)/2;
            
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])
            {
                single =  nums[mid];
                break;
            }
            

            if(nums[mid] == nums[mid-1] && mid%2 ==1  || nums[mid] == nums[mid+1] && mid%2 == 0)
            l = mid+1;
            else
            r = mid-1;

        }
        return single;
        
    }
}