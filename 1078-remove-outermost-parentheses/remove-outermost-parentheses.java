class Solution {
    public String removeOuterParentheses(String s) 
    {
        String s2 = "";
        int open = 0;

        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                if(open > 0)
                {
                    s2+=c;
                }
                open++;
            }
            else
            {
                if(open > 1)
                {
                    s2+=c;
                }
                open--;

            }
        }

        return s2;
        
    }
}