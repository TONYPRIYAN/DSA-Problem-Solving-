class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
       if(strs == null || strs.length == 0) return new ArrayList<>();


       Map<String, List<String>> map  = new HashMap();

       for(String s: strs)
       {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String c = new String(arr);

        map.computeIfAbsent(c, k-> new ArrayList<>()).add(s);
       }

       return new ArrayList(map.values());

    }
}