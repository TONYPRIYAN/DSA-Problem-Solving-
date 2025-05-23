class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> seen = new HashSet<>();

        String[] arr = s.split(" ");

        if(pattern.length() != arr.length) return false;

        for(int i=0;i<pattern.length();i++)
        {
            char c = pattern.charAt(i);
            if(map.containsKey(c))
            {
                if(!map.get(c).equals(arr[i])) return false;
            }
            else
            {
                if(seen.contains(arr[i])) return false;
                map.put(c,arr[i]);
                seen.add(arr[i]);
            }
        }

        return true;
    }
}