class Solution {
    public void nextPermutation(int[] nums) 
    {

        int pivot = lastIndex(nums)-1;

        if(pivot != -1)
        {
            int prefix = nextGreat(nums,pivot);

            swap(nums,pivot,prefix);
        }

    reverse(nums,pivot+1);
        
    }

    public int lastIndex(int[] nums)
    {
        for(int i = nums.length-1;i>0;--i)
        {
            if(nums[i-1] < nums[i])
            {
                return i;
            }
        }
        return 0;
    }

    public int nextGreat(int[] nums,int value)
    {
        for(int i = nums.length-1;i>0;--i)
        {
            if(nums[i] > nums[value])
            {
                return i;
            }
        }
        return -1;
    }

    public void reverse(int[] nums,int i)
    {
        int j = nums.length-1;

        while(i < j)
        {
            swap(nums,i++,j--);
        }
    }



    public void swap(int[] nums,int i,int j)
    {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    }
