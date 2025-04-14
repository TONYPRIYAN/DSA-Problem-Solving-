class Solution {
    public int largestRectangleArea(int[] heights) 
    {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        int n = heights.length;
        for(int i=0;i<=n;i++)
        {
            while(!st.isEmpty() && ((i==n) || (heights[st.peek()] >= heights[i])))
            {
                int height = heights[st.peek()];
                st.pop();
                int widgth;
                if(st.isEmpty())
                widgth = i;
                else
                widgth = i - st.peek() -1;

                max = Math.max(max,height*widgth);
                
            }
            st.push(i);
        }
        return max;
        
    }
}