class Solution {
    public String mapWordWeights(String[] words, int[] weights) 
    {
        StringBuilder s = new StringBuilder();

        for(String word : words)
        {
            int tot = 0;
            for(char x : word.toCharArray())
            {
                tot += weights[x -'a'];
            }

            tot %= 26;
            s.append((char)('a' + (25 - tot)));

        }

        return s.toString();
        
    }
}