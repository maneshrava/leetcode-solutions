
class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int max = 0;
            int count = 0;

            while (n > 0) {
                int digit = n % 10;
                max = Math.max(max, digit);
                count++;
                n = n / 10;
            }

            int encrypted = 0;

            while (count > 0) {
                encrypted = encrypted * 10 + max;
                count--;
            }

            sum += encrypted;
        }

        return sum;
    }
}
