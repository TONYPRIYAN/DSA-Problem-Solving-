class Solution {
    public int trap(int[] height) 
    {
        int l = 0;
        int r = height.length-1;
        int count = 0;
        int maxl = 0;
        int maxr = 0;

        while(l <= r)
        {
            if(height[l] <= height[r])
            {
                if(height[l] >= maxl)
                {
                    maxl = height[l];
                }
                else
                {
                    count += maxl - height[l];
                }
                l++;
            }
            else
            {
                if(height[r] >= maxr)
                {
                    maxr = height[r];
                }
                else
                {
                    count += maxr - height[r];
                }
                r--;

            }
        }

        return count;
        
    }
}