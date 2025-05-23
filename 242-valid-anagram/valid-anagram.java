class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length())
        {
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char c : s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray())
        {
            map2.put(c,map2.getOrDefault(c,0)+1);
        }

        for(char c : map.keySet())
        {
            if(!map2.containsKey(c) || map2.get(c).intValue() != map.get(c).intValue())
            {
                return false;
            }
            
        }

        return true;


    }
}