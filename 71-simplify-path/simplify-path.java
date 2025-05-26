class Solution {
    public String simplifyPath(String path) 
    {
        Stack<String> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] arr = path.split("/");

        for(int i=0;i<arr.length;i++)
        {
            String ch = arr[i];

            if(!st.isEmpty() && ch.equals(".."))
            {
                st.pop();
            }
            else if(!ch.equals("..") && !ch.equals(".") && !ch.equals(""))
            {
                st.push(ch);
            }
            
        }

        if(st.isEmpty())
        {
            return "/";
        }

        while(!st.isEmpty())
        {
            res.insert(0,st.pop()).insert(0,"/");
        }

        return res.toString();
        
    }
}