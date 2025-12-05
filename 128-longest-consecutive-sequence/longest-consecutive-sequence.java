class Solution {
    public int longestConsecutive(int[] nums) 
    {

        Set set = new HashSet<>();

        for(int x : nums)
        {
            set.add(x);
        }

        
        int longst = 0;

        for(int x : nums)
        {
            int n = x;
            int cnt = 1;

            while(set.contains(--n))
            {
                cnt++;
                set.remove(n);
            }

            n =x;
            while(set.contains(++n))
            {
                cnt++;
                set.remove(n);
            }

            longst = Math.max(longst,cnt);


        }

        return longst;
        
    }
}