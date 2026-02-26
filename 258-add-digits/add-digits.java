class Solution {
    public int addDigits(int num) 
    {

        int n = num;
        int sum = n;
        while(sum > 9)
        {
            sum = sumOfDigits(sum);
        }

        return sum;
        
        
    }

    public int sumOfDigits(int n)
    {
        int sum = 0;

        while(n > 0)
        {
            sum += n%10;
            n /= 10;
        }

        return sum;
    }



}