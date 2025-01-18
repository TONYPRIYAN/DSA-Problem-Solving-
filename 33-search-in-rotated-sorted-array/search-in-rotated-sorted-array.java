class Solution {
    public int search(int[] nums, int target) 
    {
        int low = 0;
        int high = nums.length -1;
        while(low<high)
        {
            int mid = (low+high)/2;

            if(nums[mid] == target)
            return mid;
            else if(nums[mid] > nums[high])
            low = mid+1;
            else
            high = mid;

        }

        int rotate = low;
         low = 0;
        high = nums.length -1;

        while(low <= high)
        {
            int mid = (low+high)/2;
            int mid2 = (mid+rotate)%nums.length;

            if(nums[mid2] == target)
            return mid2;
            else if(nums[mid2] > target)
            high = mid-1;
            else
            {
                low = mid+1;
            }
        }


        return -1;
        
    }
}