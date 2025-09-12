class Solution {
    public boolean doesAliceWin(String s) 
    {
        int count = 0;


        for(char c : s.toCharArray())
        {
            if("aeiou".indexOf(c) != -1) count++;
        }

        if(count == 0)
        return false;

        if(count %2 != 0)
        return true;

        return true;
        
    }
}