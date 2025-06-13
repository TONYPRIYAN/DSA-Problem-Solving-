class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int[] arr = new int[2];
        int l = 0;
        int r = nums.length-1;
        int first = -1;

        while(l<=r)
        {
            int mid = l + (r-l)/2;

            if(nums[mid] == target)
            {
                first = mid;
                r = mid-1;
            }
            else if(nums[mid] > target)
            {
                r = mid -1;
            }
            else
            {
                l = mid +1;
            }
        } 

        arr[0] = first;

        l = 0;
        r = nums.length-1;
        int last = -1;

        while(l<=r)
        {
            int mid = l + (r-l)/2;

            if(nums[mid] == target)
            {
                last = mid;
                l = mid+1;
            }
            else if(nums[mid] > target)
            {
                r = mid -1;
            }
            else
            {
                l = mid +1;
            }
        } 

        arr[1] = last;

        return arr;

    }
}