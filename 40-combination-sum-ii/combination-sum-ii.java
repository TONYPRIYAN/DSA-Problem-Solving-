class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        sub(0,candidates,target,ans,new ArrayList<>());
        return ans;

    }

    public void sub(int i,int[] arr,int target,List<List<Integer>> ans,List<Integer> list)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int j = i;j<arr.length;j++)
        {
            if(j > i && arr[j] == arr[j-1]) continue;
            if(arr[j] > target) break;


            list.add(arr[j]);
            sub(j+1,arr,target-arr[j],ans,list);
            list.remove(list.size()-1);
        }
    }

}