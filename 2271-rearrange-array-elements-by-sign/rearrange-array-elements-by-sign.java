class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        int[] arr  = new int[nums.length];
        int p = 0;
        int q = 1;

        for(int n : nums)
        {
            if(n > 0)
            {
                arr[p] = n;
                p +=2;
            }
            else
            {
                arr[q] = n;
                q+=2;
            }
        }

        return arr;
    }
}