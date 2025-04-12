class Solution {
    public String removeKdigits(String num, int k) 
    {
        if(num.length() == k)
        {
            return "0";
        }


        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<num.length();i++)
        {
            while(!st.isEmpty() && k>0 && (st.peek() -'0') > (num.charAt(i)- '0'))
            {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }

        while(k > 0)
        {
            st.pop();
            k--;
        }

       StringBuilder sb = new StringBuilder();
       for(char c : st)
       {
        sb.append(c);
       }

       while(sb.length()>1 && sb.charAt(0) == '0')
       {
        sb.deleteCharAt(0);
       }

       return sb.length() == 0 ? "0" : sb.toString();
    }
}