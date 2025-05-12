class Solution {
    public int majorityElement(int[] nums) 
    {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int n = (nums.length)/2;
        int c = 0;

        for(int x : map.keySet())
        {
            if(map.get(x) > n)
            {
                c = x;
            }
        }

        return c;

        
    }
}