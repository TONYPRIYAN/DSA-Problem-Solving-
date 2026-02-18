class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int n = nums.length;
        int i=0;
        int j = n-1;
        int[] arr  = new int[n];

        for(int k=n-1;k>=0;k--)
        {
            if(Math.abs(nums[i]) > Math.abs(nums[j]))
            {
                arr[k] = nums[i]*nums[i];
                i++;
            }
            else
            {
                arr[k] = nums[j]*nums[j];
                j--;
            }
        }

        return arr;
        
    }
}