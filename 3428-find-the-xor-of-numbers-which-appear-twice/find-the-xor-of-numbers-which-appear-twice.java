class Solution {
    public int duplicateNumbersXOR(int[] nums) 
    {

        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;

        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.get(x) > 1)
            {
                ans ^= x;
            }
        }

        return ans;
        
    }
}