class Solution {
    public int jump(int[] nums) 
    {

        int l = 0;
        int r = 0;
        int res = 0;
        int end = 0;

        while(r < nums.length-1)
        {
            end = 0;
            for(int i=l;i<r+1;i++)
            {
                end = Math.max(end,i+nums[i]);
            }
            l = r;
            r = end;
            res++;

        }

        return res;
        
    }
}