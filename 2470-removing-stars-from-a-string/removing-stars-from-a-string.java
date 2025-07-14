class Solution {
    public String removeStars(String s) 
    {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray())
        {
            if(c != '*')
            {
                st.push(c);
            }
            else
            {
                st.pop();
            }
        }

        StringBuilder str = new StringBuilder();

        while(!st.isEmpty())
        {
            str.append(st.pop());
        }

        return str.reverse().toString();
        
    }
}