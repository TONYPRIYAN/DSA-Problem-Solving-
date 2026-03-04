class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;
        for(int x : piles)
            max = Math.max(max, x);

        int l = 1;
        int r = max;
        int ans = max;

        while(l <= r) {

            int mid = l + (r - l) / 2;

            long totalHours = hours(piles, mid);

            if(totalHours <= h) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    public long hours(int[] arr, int speed) {

        long total = 0;

        for(int x : arr) {
            total += (x + (long)speed - 1) / speed;
        }

        return total;
    }
}