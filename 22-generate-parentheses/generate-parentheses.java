class Solution {
    public List<String> generateParenthesis(int n) 
    {

        List<String> arr = new ArrayList<>();

        generate(arr,"",0,0,n);
        return arr;
        
    }

    public void generate(List<String> arr,String str,int open,int close,int n)
    {
        if(str.length() == 2*n)
        {
            arr.add(str);
            return;
        }

        if(open < n)
        {
            generate(arr,str+"(",open+1,close,n);
        }

        if(close < open)
        {
            generate(arr,str+")",open,close+1,n);

        }
    }
}