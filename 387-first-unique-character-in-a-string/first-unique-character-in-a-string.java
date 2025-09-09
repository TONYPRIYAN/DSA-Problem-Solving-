class Solution {
    public int firstUniqChar(String s) 
    {
        Map<Character,Integer> map = new LinkedHashMap<>();
        Set<Character> set = new HashSet<>();

        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                map.put(s.charAt(i), i);
                set.add(s.charAt(i));
            }
            else
            {
                map.remove(s.charAt(i));
            }

        }

        return map.size() == 0 ? -1 : map.entrySet().iterator().next().getValue();
        
    }
}