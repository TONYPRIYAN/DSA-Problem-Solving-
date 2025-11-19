class Solution {
    public int findFinalValue(int[] nums, int original) 
    {
        
        
        Set set = new HashSet<>();

        for(int x : nums)
        {
            if(x >= original)
            set.add(x);
        }

        while(set.contains(original))
        {
            original*=2;
        }

        return original;
        
    }
}