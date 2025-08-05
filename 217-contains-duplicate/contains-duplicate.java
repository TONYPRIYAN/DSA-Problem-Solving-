class Solution {
    public boolean containsDuplicate(int[] nums)
    {
        Set<Integer> dup = new HashSet<>();

        for(int x : nums)
        {
            if(dup.contains(x))
            {
                return true;
            }
            dup.add(x);
        }
        return false;
        
    }
}