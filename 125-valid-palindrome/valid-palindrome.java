class Solution 
{
    public boolean isPalindrome(String s) 
    {
       StringBuilder s2 = new StringBuilder();

       
       for(Character c : s.toCharArray())
       {
        if(Character.isLetterOrDigit(c))
        {
            s2.append(Character.toLowerCase(c));
        }

       }

       int l = 0;
       int r = s2.length()-1;

       while(l<=r)
       {
        if(s2.charAt(l) != s2.charAt(r))
        {
            return false;
        }
        l++;
        r--;
       }

       return true;
        
        
    }
}