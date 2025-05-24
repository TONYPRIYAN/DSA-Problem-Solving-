class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) 
    {
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            for(char c : words[i].toCharArray())
            {
                if(c == x)
                {
                    arr.add(i);
                    break;
                }
            }
        }

        return arr;
    }
}