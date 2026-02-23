class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {

        List<Integer> indexs = new ArrayList<>();

        if(p == null || s == null || p.length() > s.length()) return indexs;

        int m = p.length();
        int n=  s.length();

        int l = 0;
        int r = m;

        char[] arr = p.toCharArray();
        Arrays.sort(arr);
        String str = new String(arr);

        while(r <= n)
        {

            String sub = s.substring(l,r);
            char[] chars = sub.toCharArray();
            Arrays.sort(chars);
            sub = new String(chars);

            if(str.equals(sub)) indexs.add(l);
            l++;
            r++;

        }

        return indexs;
        
    }
}