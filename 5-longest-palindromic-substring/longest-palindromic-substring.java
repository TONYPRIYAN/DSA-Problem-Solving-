class Solution {
    public String longestPalindrome(String s) {
        
        if(s == null && s.length() == 0)
        return s;

        String len = "";

        for(int i=0;i<s.length();i++)
        {
            String odd = expandCenter(s,i,i);
            String even = expandCenter(s,i,i+1);

            if(odd.length() > len.length())
                len = odd;
            if(even.length() > len.length())
                len = even;
        }

        return len;
    }

    public String expandCenter(String s,int l,int r)
    {
        while(l >=0 && r < s.length() && s.charAt(l) == s.charAt(r))
        {
            l--;
            r++;
        }

        return s.substring(l+1,r);
    }
}