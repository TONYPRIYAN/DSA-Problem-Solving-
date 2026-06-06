class Solution {
    public int majorityElement(int[] nums) {
        int ele = -1;
        int cnt = 0;

        for (int x : nums) {

            if (cnt == 0) {
                ele = x;
                cnt++;
            } else if (ele == x) {
                cnt++;
            } else {
                cnt--;
            }

        }

        return ele;

    }
}