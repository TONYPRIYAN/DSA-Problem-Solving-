class Solution {
    public int findLHS(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int ans = 0;
        for(int x : map.keySet())
        {
            if(map.containsKey(x+1))
            ans = Math.max(ans,map.get(x) + map.get(x+1));
        }
        return ans;
    }
}