class Solution {
    public String convertToTitle(int N) 
    {
        StringBuilder str = new StringBuilder();

        while(N>0)
        {
            N--;
            str.append((char)('A'+N%26));
            N = N/26;
        }

        return str.reverse().toString();
    }
}