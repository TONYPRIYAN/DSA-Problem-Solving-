class Solution {
    public int numOfStrings(String[] patterns, String word) 
    {

        int tot = 0;

        for(String str : patterns)
        {
            if(word.indexOf(str) != -1)
            {
                tot++;
            }
        }

        return tot;
        
    }
}