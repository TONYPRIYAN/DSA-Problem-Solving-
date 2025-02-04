class Solution 
{

    boolean range(int[] nums,int threshold,int mid)
    {
            boolean flag = true;
            int sum = 0;
            for(int j = 0;j<nums.length;j++)
            {
                sum += Math.ceil((double)nums[j]/mid);
                if(sum > threshold)
                {
                    flag = false;
                    break;
                }
            }

            if(flag)
            {
                return true;
            }

            return false;

    }
    public int smallestDivisor(int[] nums, int threshold) 
    {
        int max = 0;

        for ( int x : nums)
        {
            max = Math.max(max,x);
        }

        int low = 1;
        int high = max;

        while(low <= high)
        {
            int mid = low + (high-low)/2;

            if(range(nums,threshold,mid))
            {
                high = mid -1;
            }
            else
            {
                low = mid + 1;
            }
        }
       

       

        return low;
        
    }
}