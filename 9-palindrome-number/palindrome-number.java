class Solution {



    public boolean isPalindrome(int x) 
    {
        if(x < 0)
        return false;

        long num = x;
        long rev = 0;
        while(num>0)
        {
            int rem = (int)num % 10;
            rev = rev*10 +rem;
            num/=10;
        }

        return rev == x;
        



        
    }
}