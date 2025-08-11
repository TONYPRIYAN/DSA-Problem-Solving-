class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length == 0) return new ArrayList<>();


        Map<String,List<String>> map = new HashMap<>();

        for(String str : strs)
        {
            char[] c  = str.toCharArray();
            Arrays.sort(c);
            String s = new String(c);

           map.computeIfAbsent(s, k -> new ArrayList<>()).add(str);
            

        }

        return new ArrayList<>(map.values());
    }
}