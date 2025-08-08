class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        HashMap<Character,Integer> map = new HashMap();

        int l = 0;
        int r = 0;
        int len = 0;
        int n = s.length();

        while(r < n)
        {
            if(map.containsKey(s.charAt(r)))
            {
                l = Math.max(map.get(s.charAt(r))+1,l);
            }

            map.put(s.charAt(r),r);
            len = Math.max(len,r-l+1);
            r++;
        }

        return len;
        
    }
}