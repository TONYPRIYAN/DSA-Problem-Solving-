class Solution {
    public int trap(int[] arr) 
    {
        int l = 0;
        int r = arr.length -1;
        int count = 0;
        int maxl = 0;
        int maxr = 0;

        while(l <=r)
        {
            if(arr[l] <= arr[r])
            {
                if(arr[l] >= maxl)
                {
                    maxl = arr[l];
                }
                else
                {
                    count += maxl - arr[l];
                }
                l++;
            }
            else
            {
            
                if(arr[r] >= maxr)
                {
                    maxr = arr[r];
                }
                else
                {
                    count += maxr - arr[r];
                }
            
                r--;
            }  
        }

        return count;

        
    }
}