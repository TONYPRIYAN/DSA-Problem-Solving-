class Solution {
    public int[] asteroidCollision(int[] asteroids) 
    {
        Stack<Integer> st = new Stack<>();

        for(int x : asteroids)
        {
        boolean des = false;
        while(!st.isEmpty() && x<0 && st.peek() > 0)
        {
            
            if(st.peek() < -x)
            {
                st.pop();
            }
            else if(st.peek() == -x)
            {
                st.pop();
                des = true;
                break;
                
            }
            else
            {
                des  = true;
                break;
            }
        }

        if(!des)
        {
            st.push(x);
        }


        }

        int[] arr = new int[st.size()];
        for(int i=0;i<st.size();i++)
        {
            arr[i] = st.get(i);
        }

        return arr;
        
    }
}