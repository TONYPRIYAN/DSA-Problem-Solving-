class Solution {
    public int maxFrequencyElements(int[] nums) 
    {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int max = 0;

        for(int k : map.values())
        {
            max = Math.max(max,k);
        }

        int sum = 0;
        for(int k : map.values())
        {
            if(k == max)
            {
                sum += max;
            }
        }

        return sum;
        
        
    }
}