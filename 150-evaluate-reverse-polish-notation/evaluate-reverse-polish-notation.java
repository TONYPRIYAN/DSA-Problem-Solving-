class Solution {
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> st =  new Stack<>();


        for(String ele : tokens)
        {
            if(isoperator(ele))
            {
                int b = st.pop();
                int a = st.pop();
                if(ele.equals("+")) st.push(a+b);
                else if(ele.equals("-")) st.push(a-b);
                else if(ele.equals("*")) st.push(a*b);
                else  st.push(a/b);
            }
            else
            {
                st.push(Integer.parseInt(ele));

            }
        }

        return st.peek();
       
        
    }

     public boolean isoperator(String s)
        {
            return "+-*/".contains(s);
        }
}