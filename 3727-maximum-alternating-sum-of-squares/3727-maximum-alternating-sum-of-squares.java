class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long sum = 0;
        for(int i = nums.length-1 ; i>=nums.length/2 ; i--){
            sum = sum + nums[i];
        }
        for(int i = 0 ; i<nums.length/2 ; i++){
            sum = sum - nums[i];
        }
        return sum;
    }
}