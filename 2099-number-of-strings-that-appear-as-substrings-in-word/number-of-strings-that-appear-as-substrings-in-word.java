class Solution {

    public int strStr(String haystack, String needle) 
    {
        int m = haystack.length();
        int n = needle.length();

        if(n > m) return -1;

        for(int i =0;i<=m-n;i++)
        {
            if(haystack.charAt(i) == needle.charAt(0) && haystack.charAt(i+n-1) == needle.charAt(n-1))
            {
                int j=0;
                while(j < n && haystack.charAt(i+j) == needle.charAt(j))
                {
                    j++;
                }
                if(j == n) return i;

            }
        }

        return -1;
        
    }
    public int numOfStrings(String[] patterns, String word) 
    {

        int tot = 0;

        for(String str : patterns)
        {
            if(strStr(word,str) != -1)
            {
                tot++;
            }
        }

        return tot;
        
    }
}