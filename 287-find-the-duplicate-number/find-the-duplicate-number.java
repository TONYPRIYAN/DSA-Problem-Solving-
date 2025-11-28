class Solution {
    public int findDuplicate(int[] nums) 
    {

        Set set = new HashSet<>();

        for(int x : nums)
        {
            if(set.contains(x))
            {
                return x;
            }
            set.add(x);
        }
        return 0;
    }
}