class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = piles[0];

        // Find maximum pile

        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        int low = 1;
        int high = max;

        while (low < high) {

            int mid = low + (high - low) / 2;

            long hours = 0;

            // Calculate hours needed at speed mid

            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + mid - 1) / mid;
            }

            if (hours <= h) {
                // mid works, try smaller
                high = mid;
            } else {
                // mid is too slow
                low = mid + 1;
            }
        }

        return low;
    }
}