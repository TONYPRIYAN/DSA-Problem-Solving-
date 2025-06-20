class Solution {
    public void sortColors(int[] nums) 
    {

        for(int i=0;i<nums.length;i++)
        {
            int tmp = nums[i];
            int j = i-1;
            while(j >=0 && nums[j] > tmp)
            {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = tmp;
        }
        
    }
}