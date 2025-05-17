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

       return s2.toString().equals(s2.reverse().toString());
        
        
    }
}