class Solution {
    public String makeFancyString(String s) 
    {
        StringBuilder str = new StringBuilder();
        int c = 0;



        for(int i=0;i<s.length();i++)
        {
            if((i >= 2 && s.charAt(i)== s.charAt(i-1) &&
                s.charAt(i)== s.charAt(i-2)))
                {
                    continue;
                }
            str.append(s.charAt(i));
        }
        
        return str.toString();
        
    }
}