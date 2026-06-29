class Solution {
    public String convert(String s, int numRows) 
    {
        if(numRows <= 1)
        {
            return s;
        }
        StringBuilder sb = new StringBuilder();

        int inc = 2*(numRows-1);

        for(int i=0;i<numRows;i++)
        {
            for(int r=i;r<s.length();r+=inc)
            {
                sb.append(s.charAt(r));

                if(i > 0 && i < numRows-1 && r+inc-2*i < s.length())
                {
                     sb.append(s.charAt(r+inc-2*i));
                }
            }
        }

        return sb.toString();
        
    }
}