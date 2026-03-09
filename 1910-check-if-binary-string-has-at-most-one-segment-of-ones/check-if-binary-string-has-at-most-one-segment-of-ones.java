class Solution {
    public boolean checkOnesSegment(String s) 
    {
       //return !s.contains("01");

       boolean seen = false;

       for(char c : s.toCharArray())
       {
        if(c == '0')
        {
            seen = true;
        }
        else if(seen)
        {
            return false;
        }
       }

       return true;
    }
}