class Solution {
    public String intToRoman(int num) 
    {
        int[] N = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] R = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};


        String str = "";
        int i = 0;

        while(num > 0)
        {
            if(num >= N[i])
            {
                str += R[i];
                num -= N[i];

            }
            else
            {
                i++;
            }

        }

        return str;
        
    }
}