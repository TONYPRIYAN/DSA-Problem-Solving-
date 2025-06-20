class Solution {
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int max = 0;
        int num = 0;

        for(int k : map.keySet())
        {
            if(map.get(k) > max)
            {
                num = k;
                max = map.get(k);
            }
        }
        
        return num;
        
    }
}