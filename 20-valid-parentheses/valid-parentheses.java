class Solution {
    public boolean isValid(String s) 
    {
        
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(stack.isEmpty())
            {
                stack.push(ch);
            }
            else if(ch == ')' && stack.peek()=='(')
            {
                stack.pop();
            }
            else if(ch == '}' && stack.peek()=='{')
            {
                stack.pop();
            }
            else if(ch == ']' && stack.peek()=='[')
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
           
            

        }

        return stack.isEmpty();
        
    }
}