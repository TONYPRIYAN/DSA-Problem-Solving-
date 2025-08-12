class Solution {
    public String minWindow(String s, String t) 
    {

        if(s.length() < t.length() || s == null ||  t == null  || s.length() == 0 || t.length() == 0)
        return new String();

        int[] map = new int[128];
        int count = t.length();
        for(char c : t.toCharArray())
        {
            map[c]++;
        }

        int l = 0;
        int r= 0;
        int minlen = Integer.MAX_VALUE;
        int start = 0;
        char[] arr = s.toCharArray();

        while(r < arr.length)
        {
            if(map[arr[r++]]-- > 0)
            {
                count--;
            }
        

        while(count == 0)
        {
            if(r - l < minlen)
            {
                start = l;
                minlen = r-l;
            }
            if(map[arr[l++]]++ == 0)
            {
                count++;
            }
        }
        }

        return minlen == Integer.MAX_VALUE ? new String() : new String(arr,start,minlen);

        
    }
}