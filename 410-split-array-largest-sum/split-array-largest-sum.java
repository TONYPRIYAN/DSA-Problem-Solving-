class Solution {

    int check(int[] nums,int arr)
    {
        int sub = 1;
        int ps = 0;

        for(int x : nums)
        {
            if(ps + x <= arr)
            {
                ps+=x;
            }
            else
            {
                sub++;
                ps = x;
            }

        }

        return sub;

    }
    public int splitArray(int[] nums, int k) 
    {
        int low = 0;
        int high = 0;

        for( int x : nums)
        {
            low = Math.max(low,x);
            high+=x;
        }

        

        while(low < high)
        {
            int mid = low + (high-low)/2;
            int calc = check(nums,mid);

            if(calc > k)
            {
                low = mid + 1;
            }
            else
            {
                high = mid;
            }

            

        }
        return low;
        
            

        
       
    }
}