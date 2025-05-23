class Solution {
    public boolean isHappy(int n) 
    {
        Set<Integer> seen = new HashSet<>();




        int num = n;

        while(num != 1)
        {
            num = sums(num);
        if(seen.contains(num))
        {
            return false;
        }
        else
        {
            seen.add(num);
        }
        }
        
            return true;
        
        
        
    }


    public int sums(int x)
    {
        int sum = 0;
        
        while(x>0)
        {
            sum = sum + (x%10) * (x%10);
            x = x/10;
        }
        return sum;


    }
}