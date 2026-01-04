class Solution {
    public int sumFourDivisors(int[] nums) {
        int totsum = 0;

        for (int x : nums) {
            int cnt = 0;
            int sum = 0;

            for (int i = 1; i * i <= x; i++) {
                if (x % i == 0) {
                    int d1 = i;
                    int d2 = x / i;

                    if (d1 == d2) { 
                        cnt++;
                        sum += d1;
                    } else {
                        cnt += 2;
                        sum += d1 + d2;
                    }
                }

                if (cnt > 4) break;
            }

            if (cnt == 4) {
                totsum += sum;
            }
        }

        return totsum;
    }
}
