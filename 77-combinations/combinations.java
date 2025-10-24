class Solution {
    public List<List<Integer>> combine(int n, int k) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        comb(1,ans,n,k,new ArrayList<>());
        return ans;
        
    }

    public void comb(int i,List<List<Integer>> ans,int n,int k,List<Integer> list)
    {
        if(list.size() == k)
        {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int j=i;j<=n;j++)
        {
            list.add(j);
            comb(j+1,ans,n,k,list);
            list.remove(list.size()-1);
        }
    }
}