class Solution {

    public int[] gcdValues(int[] nums, long[] queries) {

        // Find maximum element
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Frequency of each number
        int[] freq = new int[max + 1];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        // Count how many numbers are divisible by each i
        int[] cnt = new int[max + 1];

        for (int i = 1; i <= max; i++) {
            for (int j = i; j <= max; j += i) {
                cnt[i] += freq[j];
            }
        }

        // exact[i] = number of pairs whose gcd is exactly i
        long[] exact = new long[max + 1];

        for (int i = max; i >= 1; i--) {

            long pairs = 1L * cnt[i] * (cnt[i] - 1) / 2;

            exact[i] = pairs;

            for (int j = i + i; j <= max; j += i) {
                exact[i] -= exact[j];
            }
        }

        // Prefix sum
        long[] pre = new long[max + 1];

        for (int i = 1; i <= max; i++) {
            pre[i] = pre[i - 1] + exact[i];
        }

        // Answer queries
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            long q = queries[i] + 1;

            int left = 1;
            int right = max;

            while (left < right) {

                int mid = left + (right - left) / 2;

                if (pre[mid] >= q) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            ans[i] = left;
        }

        return ans;
    }
}