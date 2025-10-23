class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        sub(0,nums,ans,new ArrayList<>());

        return ans;

    }

    public void sub(int i,int[] nums,List<List<Integer>> ans,List<Integer> list)
    {
        if(i == nums.length)
        {

        
        if(list.size() == 0)
        {
            ans.add(new ArrayList<>());
        }
        else
        {
            ans.add(new ArrayList<>(list));
        }
        return;
        }


        list.add(nums[i]);
        sub(i+1,nums,ans,list);
        list.remove(list.size()-1);
        sub(i+1,nums,ans,list);

    }

}