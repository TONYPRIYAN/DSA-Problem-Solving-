class Solution {
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> st = new Stack<>();

        for(String s : tokens)
        {
            if(isop(s))
            {
                int res = 0;
                int b  = st.pop();
                int a = st.pop();
                if(s.equals("+")) res = a + b;
                else if(s.equals("-")) res = a-b;
                else if(s.equals("*")) res = a*b;
                else res = a/b;     

                st.push(res);           
            }
            else
            {
                st.push(Integer.parseInt(s));
            }

        }

        return st.pop();
        
    }

    public boolean isop(String s)
    {
        return "+-/*".contains(s);
    }
}