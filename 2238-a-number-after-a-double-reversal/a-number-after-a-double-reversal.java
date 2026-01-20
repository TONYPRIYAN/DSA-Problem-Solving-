class Solution {
    public boolean isSameAfterReversals(int num) 
    {

        int n = num;
        if(n == 0) return true;

        int rem = 0;
        boolean flag = false;
        while(n > 0)
        {
            if(flag)
            {
                rem = n%10;
                n = n/10;
            }
            else
            {
            rem = n%10;
            if(rem == 0) return false;
            if(rem > 0) flag = true;
            n = n/10;
            }
            
        }
        return true;
        
    }
}