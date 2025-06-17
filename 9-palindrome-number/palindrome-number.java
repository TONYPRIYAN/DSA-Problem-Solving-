class Solution {
    public boolean isPalindrome(int x) 
    {

        int num = x;
        int sum = 0;
        while(num > 0)
        {
            sum  = sum * 10 + (num % 10);
            num /= 10;
        }

        return x == sum;
        
    }
}