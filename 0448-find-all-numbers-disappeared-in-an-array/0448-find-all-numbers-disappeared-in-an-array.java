class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;

        // Check numbers before the first element
        for (int i = 1; i < nums[0]; i++) {
            ans.add(i);
        }

        for (int i = 0; i < n - 1; i++) {

            if (nums[i] == nums[i + 1] || nums[i] == nums[i + 1] - 1) {
                continue;
            }
            else {
                int j = nums[i] + 1;

                while (j < nums[i + 1]) {
                    ans.add(j);
                    j++;
                }
            }
        }

        // Check numbers after the last element
        for (int i = nums[n - 1] + 1; i <= n; i++) {
            ans.add(i);
        }

        return ans;
    }
}