class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,1);

        int c = 1;
        for(int i=0;i<n;i++)
        {
            ans[i] *= c;
            c *= nums[i];
        }

        c = 1;
        for(int i=n-1;i>=0;i--)
        {
            ans[i] *= c;
            c *= nums[i];
        }
        
        return ans;
        
    }
}