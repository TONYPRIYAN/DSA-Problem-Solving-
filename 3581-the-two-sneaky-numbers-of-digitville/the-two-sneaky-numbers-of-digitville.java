class Solution {
    public int[] getSneakyNumbers(int[] nums) 
    {
        Set set = new HashSet<>();
        int i=0;
        int[] ans = new int[2];
        for(int x : nums)
        {
            if(set.contains(x))
            {
                ans[i++] = x;
            }
            else
            {
                set.add(x);
            }
        }

        return ans;
        
    }
}