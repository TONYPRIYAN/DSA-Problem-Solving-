class Solution {
    public int[] constructTransformedArray(int[] nums) 
    {

        int n = nums.length;

        int[] ans = new int[n];
        

        for(int i=0;i<n;i++)
        {
            int num = nums[i];

            int target = (i+num)%n;
            if(target < 0)
            {
                target += n;
            }

            ans[i] = nums[target];
        }

        return ans;
        
    }
}