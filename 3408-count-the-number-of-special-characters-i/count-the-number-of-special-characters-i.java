class Solution {
    public int numberOfSpecialChars(String word) 
    {
        boolean[] lwr = new boolean[26];
        boolean[] upr = new boolean[26];

        int count = 0;

        for(char c : word.toCharArray())
        {
            if(Character.isLowerCase(c))
            {
                lwr[c-'a'] = true;
            }
            else
            {
                upr[c-'A'] = true;
            }
        }

        for(int i=0;i<26;i++)
        {
            if(lwr[i] && upr[i]) count++;
        }

        return count;



        
    }
}