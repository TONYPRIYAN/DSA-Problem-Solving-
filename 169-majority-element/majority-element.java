class Solution {
    public int majorityElement(int[] nums) 
    {

        Map<Integer,Integer> map = new HashMap<>();

        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int max = 0;
        int key = 0;

        for(int x : map.keySet())
        {
            if(map.get(x) > max)
            {
                max = map.get(x);
                key = x;
            }
        }

        return key;
        
    }
}