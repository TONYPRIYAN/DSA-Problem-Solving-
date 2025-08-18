class Solution {
    public int myAtoi(String s) {
        int n = s.length();

        int i = 0, total = 0, flag = 1;

        if (n == 0)
            return 0;

        while (i < n && s.charAt(i) == ' ')
            i++;

        if (n == i)
            return 0;

        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            flag = s.charAt(i) == '+' ? 1 : -1;
            i++;
        }

        while (i < n) {
            int dig = s.charAt(i) - '0';
            if (dig < 0 || dig > 9)
                break;

            if (total > Integer.MAX_VALUE / 10 ||
                    (total == Integer.MAX_VALUE / 10 && dig > Integer.MAX_VALUE % 10)) {
                return (flag == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + dig;
            i++;
        }

            return total * flag;

        }
    }
