class Solution {
    public int findFinalValue(int[] nums, int original) 
    {
        int num = original;
        
        Set set = new HashSet<>();

        for(int x : nums)
        {
            set.add(x);
        }

        while(set.contains(num))
        {
            num*=2;
        }

        return num;
        
    }
}