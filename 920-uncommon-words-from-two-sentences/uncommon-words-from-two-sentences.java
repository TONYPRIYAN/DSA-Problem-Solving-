class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        Map<String, Integer> count = new HashMap<>();
        for (String w : (s1 + " " + s2).split(" "))
        {
            count.put(w, count.getOrDefault(w, 0) + 1);
        }
            
        ArrayList<String> res = new ArrayList<>();
        
        for (String w : count.keySet())
        {
            if (count.get(w) == 1)
                res.add(w);
        }
            
        return res.toArray(new String[0]);
    }
}