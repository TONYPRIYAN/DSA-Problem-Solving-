class Solution {
    public int compress(char[] chars) 
    {
        int ans = 0;
        int i = 0;
        while(i < chars.length)
        {
            char c  = chars[i];
            int count = 0;
            while(i < chars.length && chars[i] == c)
            {
                count++;
                i++;
            }

            chars[ans++] = c;

            if(count != 1)
            {
                for(char ch : Integer.toString(count).toCharArray())
                {
                    chars[ans++] = ch;
                }
            }
        }

        return ans;
        
    }
}