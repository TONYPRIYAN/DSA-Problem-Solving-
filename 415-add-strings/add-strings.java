class Solution {
    public String addStrings(String num1, String num2) 
    {

        StringBuilder str = new StringBuilder();

        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        int sum  = 0;

        while(i >= 0 || j >= 0 || carry > 0)
        {
            int sum1 = (i >= 0)? num1.charAt(i--)-'0':0;
            int sum2 = (j >= 0)? num2.charAt(j--)-'0':0;

            sum = sum1+sum2+carry;
            str.append(sum%10);
            carry = sum/10;
        }

        return str.reverse().toString();
        
        
    }
}