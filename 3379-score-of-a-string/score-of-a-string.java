class Solution {
    public int scoreOfString(String s) 
    {
        int tot = 0;

        for(int i=0;i<s.length()-1;i++)
        {
            
            tot = tot + Math.abs(s.charAt(i) - s.charAt(i+1));
        }

        return tot;
        
    }
}