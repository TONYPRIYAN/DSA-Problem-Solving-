class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        
        HashMap<Character,Integer> m = new HashMap<>();

         for(char c : magazine.toCharArray())
        {
            m.put(c,m.getOrDefault(c,0)+1);
        }

        for(char c : ransomNote.toCharArray())
        {
            if(!m.containsKey(c) || m.get(c) == 0)
            {
                return false;
            }
            else
            {
                m.put(c,m.get(c)-1);
            }
        }
        return true;

        

    }
}