class Solution {
    public int search(int[] nums, int target)
    {
        int l = 0;
        int r = nums.length-1;
        while(l<=r)
        {
            int mid = (l+r)/2;
            if(nums[mid] == target)
            return mid;

            if(nums[mid]>target)
            r = mid-1;

            if(nums[mid]<target)
            l = mid+1;
        }

        return -1;
        
    }
}