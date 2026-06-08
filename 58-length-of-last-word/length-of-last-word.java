class Solution {
    public int lengthOfLastWord(String s) 
    {
       int i = s.length()-1;
        int len = 0;
       while(i >= 0)
       {
         if(s.charAt(i) == ' ' && len == 0)
         {
            i--;
            continue;
         }
         else if(s.charAt(i) != ' ')
         {
            len ++;
            i--;
         }
         else
         {
            break;
         }

       }

       return len;
    }
}