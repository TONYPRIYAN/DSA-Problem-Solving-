class Solution {
    public int[] asteroidCollision(int[] arr)
    {
        Stack<Integer> st = new Stack<>();

        for(int x : arr)
        {
            boolean des = false;
            while(!st.isEmpty() && x<0 && st.peek()>0)
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
                    des = true;
                    break;
                }

            }

            if(!des)
            {
                st.push(x);
            }
        }

        
        
                
    int[] arr2 = new int[st.size()];

    for(int i=0;i<st.size();i++)
    {
        arr2[i] = st.get(i);
    }

    

            
        

        
        return arr2;
        
    }
}