class Solution {
    public int longestConsecutive(int[] nums) 
    {
        Set<Integer> set  = new HashSet<>();

        for(int n : nums)
        {
            set.add(n);
        }
        int longst = 0;

        for(int n : nums)
        {
            int c = 1;
            int num = n;
            while(set.contains(--num))
            {
                c++;
                set.remove(num);
            }

            num = n;
            while(set.contains(++num))
            {
                c++;
                set.remove(num);
            }

            longst = Math.max(longst,c);

        }

        return longst;
    }
}