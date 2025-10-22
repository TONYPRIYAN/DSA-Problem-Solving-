class Solution {

    public void sub(int i,List<List<Integer>> arr2,int[] arr, int target,List<Integer> list)
    {
        if(i == arr.length)
        {
            if(target == 0)
            {
                arr2.add(new ArrayList<>(list));
            }
            return;
        }

        if(arr[i] <= target)
        {
            list.add(arr[i]);

            sub(i,arr2,arr,target - arr[i],list);

            list.remove(list.size() - 1);

        }

        sub(i+1,arr2,arr,target,list);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {

        List<List<Integer>> arr2 = new ArrayList<>();

        sub(0,arr2,candidates,target,new ArrayList<>());

        return arr2;
        
    }
}