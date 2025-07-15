class Solution {
    public boolean isValid(String word) 
    {
        int len = word.length();

        if(len < 3)
        {
            return false;
        }
        int v = 0;
        int c = 0;
        String vow = "aeiou";

        for(char x : word.toCharArray())
        {
            x = Character.toLowerCase(x);
            if(x >= 'a' && x <= 'z')
            {
                if(vow.indexOf(x) != -1)
                {
                    c++;
                }
                else
                {
                    v++;
                }
            }

            else if(x >= '0' && x<='9')
            {
                continue;
            }
            else
            {
                return false;
            }
        }

        return c > 0 && v > 0;
    }
}