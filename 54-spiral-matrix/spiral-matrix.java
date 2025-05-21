class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {

        List<Integer> arr = new ArrayList<>();

        int l=0;
        int r = matrix[0].length -1;
        int top = 0;
        int bot = matrix.length -1;

        while(l <= r && top <= bot)
        {
            for(int i=l;i<=r;i++)
            {
                arr.add(matrix[top][i]);
            }
            top++;

             for(int i=top;i<=bot;i++)
            {
                arr.add(matrix[i][r]);
            }
            r--;

            if(top<=bot)
            {
                for(int i=r;i>=l;i--)
                {
                    arr.add(matrix[bot][i]);
                }
            bot--;
            }

            if(l<=r)
            {
                for(int i=bot;i>=top;i--)
                {
                    arr.add(matrix[i][l]);
                }
            l++;
            }



        }
        return arr;
       
    }
}