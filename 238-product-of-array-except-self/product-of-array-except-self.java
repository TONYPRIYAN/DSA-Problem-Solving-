class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr,1);

        int c = 1;
        for(int i=0;i<n;i++)
        {
            arr[i] *= c;
            c *= nums[i];
        }

        c = 1;
        for(int i=n-1;i>=0;i--)
        {
            arr[i] *= c;
            c *= nums[i];
        }

        return arr;
        
    }
}