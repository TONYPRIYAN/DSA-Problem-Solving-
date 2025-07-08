class Solution {
    public int maxOperations(int[] nums, int k) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int c = 0;

        for(int i : nums)
        {
            int x = k-i;
            if(map.containsKey(x))
            {
                c++;
                if(map.get(x) == 1)
                {
                    map.remove(x);
                }
                else
                {
                    map.put(x,map.get(x)-1);
                }
            }
            else
            {
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }

        return c;
        
    }
}