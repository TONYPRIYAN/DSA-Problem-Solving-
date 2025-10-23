class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        List<List<Integer>> ans  = new ArrayList<>();
        Arrays.sort(nums);
        sub(0,ans,nums,new ArrayList<>());
        return ans;
        
    }

    public void sub(int i,List<List<Integer>> ans,int[] nums,List<Integer> list)
    {
       
        ans.add(new ArrayList<>(list));
         

        for(int j = i;j<nums.length;j++)
        {
            if(i != j && nums[j] == nums[j-1]) continue;

            list.add(nums[j]);
            sub(j+1,ans,nums,list);
            list.remove(list.size() - 1);
        }


    }


}