class Solution {
    public int search(int[] nums, int target) 
    {
        int n = nums.length;

        int l = 0;
        int r = n-1;

        while(l < r)
        {
            int mid = l + (r-l)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] > nums[r])
            {
                l = mid + 1;
            }
            else
            {
                r = mid;
            }
        }

        int start = l;

        l=0;
        r = n-1;

        while(l <= r)
        {
            int mid = l + (r-l)/2;
            int mid2 = (start+mid)%n;

            if(nums[mid2] == target)
            {
                return mid2;
            }

            else if(nums[mid2] < target)
            {
                l = mid + 1;
            }
            else
            {
                r = mid-1;
            }
        }

        return -1;
        
    }
}