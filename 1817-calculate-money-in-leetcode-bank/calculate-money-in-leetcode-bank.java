class Solution {
    public int totalMoney(int n) 
    {

        int weeks = n/7;
        int rem = n%7;

        int tot = 28 * weeks +  7 * (weeks * (weeks-1))/2;

        tot += rem * (2 * (weeks + 1) + (rem-1))/2;

        return tot;


        
    }
}