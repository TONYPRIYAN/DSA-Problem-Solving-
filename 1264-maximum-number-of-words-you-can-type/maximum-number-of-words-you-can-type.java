class Solution {
    public int canBeTypedWords(String text, String brokenLetters) 
    {

        Set<Character> set = new HashSet<>();

        for(char c : brokenLetters.toCharArray())
        {
            set.add(c);
        }

        String[] words = text.split("\\s+");
        int count = 0;


        for(String word:words)
        {
            boolean flag = true;
            for(char c : word.toCharArray())
            {
                if(set.contains(c))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                count++;
            }
        }

        return count;


        
    }
}