class Solution {
    public List<String> removeAnagrams(String[] words) 
    {

        Stack<String> st = new Stack<>();
        for(int i = words.length-1;i>=0;i--)
        {
            String s = words[i];
            while(!st.isEmpty() && isAnagram(st.peek(),s) == true)
            {
                st.pop();
            }
            st.push(s);
        }

        List<String> list = new ArrayList<>();
        while(!st.isEmpty())
        {
            list.add(st.pop());
        }

        return list;

        
    }

    public boolean isAnagram(String s,String t)
    {
        if(s.length() != t.length())
        return false;

        int[] freq = new int[26];

        for(char c : s.toCharArray()) freq[c - 'a']++;
        for(char c : t.toCharArray()) if(--freq[c - 'a'] < 0) return false;

        return true;




    }
}