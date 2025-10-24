class Solution {
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        per(0,nums,ans);
        return ans;
        
    }

    public void per(int i,int[] nums,List<List<Integer>> ans)
    {
        if(i == nums.length)
        {
            List<Integer> list  = new ArrayList<>();
            for(int j = 0;j<nums.length;j++)
            {
                list.add(nums[j]);
            }
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int j = i;j<nums.length;j++)
        {
            swap(i,j,nums);
            per(i+1,nums,ans);
            swap(i,j,nums);

        }
    }

    public void swap(int i,int j,int[] nums)
    {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}