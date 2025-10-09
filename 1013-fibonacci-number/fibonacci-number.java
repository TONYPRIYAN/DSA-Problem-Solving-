class Solution {
    public int fib(int n) 
    {
        int[] mem = new int[n+1];
        return fibo(n,mem);
    }

    public int fibo(int n,int[] mem)
    {
        if(n == 0) return 0;
        if(n == 1 || n == 2)
        {
            return 1;
        }
        if(mem[n] != 0)
        {
            return mem[n];
        }

        mem[n] = fibo(n-1,mem) + fibo(n-2,mem);
        return mem[n];

    }
}