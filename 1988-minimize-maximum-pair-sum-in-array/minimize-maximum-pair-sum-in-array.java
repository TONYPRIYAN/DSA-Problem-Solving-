class Solution {
    public int minPairSum(int[] nums) 
    {
        int max =0;

        Arrays.sort(nums);

        int l=0;
        int r=nums.length-1;

        while(l<r)
        {
            max = Math.max(max,nums[l]+nums[r]);
            l++;
            r--;
        }

        return max;
        
    }
}