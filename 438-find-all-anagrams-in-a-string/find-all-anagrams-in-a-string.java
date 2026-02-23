class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {

        List<Integer> indexs = new ArrayList<>();

        if(p == null || s == null || p.length() > s.length()) return indexs;

        int m = p.length();
        int n=  s.length();

        int[] freq = new int[26];

        for(char c : p.toCharArray())
        {
            freq[c-'a']++;
        }

        int l = 0;
        int r = 0;
        int count = m;

        while(r < n)
        {
            if(freq[s.charAt(r)-'a']-- > 0)
            {
                count--;
            }

            r++;
            if(count == 0)
            {
                indexs.add(l);
            }

            if(r-l == m)
            {
                if(freq[s.charAt(l)-'a']++ >= 0)
            {
                count++;
            }
            l++;
            }
        }

        return indexs;
        
    }
}