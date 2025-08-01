class Solution {
    public int minFlips(int a, int b, int c) {
        int f = 0;

        while(a != 0 || b != 0 || c != 0)        {
            int a1 = a&1;
            int b1= b&1;
            int c1 = c&1;

            if(c1 == 0)
            {
                f += a1+b1;
            }
            else if(c1 == 1 && a1 ==0 && b1 == 0)
            {
                f += 1;
            }

            a >>= 1;
            b >>= 1;
            c >>= 1;
        }

        return f;
    }
}