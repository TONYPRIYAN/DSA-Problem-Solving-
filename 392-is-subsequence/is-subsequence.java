class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        int i = 0;
        int l = 0;

        while(i < s.length() && l < t.length())
        {
            if(s.charAt(i) == t.charAt(l))
            {
                i++;
            }
            l++;
        }

        return i == s.length();
        
    }
}