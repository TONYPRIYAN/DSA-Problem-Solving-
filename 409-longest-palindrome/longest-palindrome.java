class Solution {
    public int longestPalindrome(String s) 
    {
        if(s.length()==1)
        return 1;

        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int len = 0;
        boolean odd = false;
        for(int c: map.values())
        {
            if(c % 2 == 0)
            {
                len += c;
            }
            else
            {
                len += c - 1;
                odd = true;
            }
        }

        if(odd)
        {
            len += 1;
        }

        return len;

        
    }
}