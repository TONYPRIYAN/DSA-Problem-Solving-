class Solution {
    public String convert(String s, int numRows) 
    {
        if(numRows == 1)
        {
            return s;
        }
        StringBuilder s2 = new StringBuilder();
        int inc = 2*(numRows-1);

        for(int i=0;i<numRows;i++)
        {
            
            for(int r = i;r<s.length();r+=inc)
            {
                s2.append(s.charAt(r));

                if(i >0 && i<numRows-1 && r+inc-2*i < s.length())
                {
                    s2.append(s.charAt(r+inc-2*i));
                }
            }
        }

        return s2.toString();
        
    }
}