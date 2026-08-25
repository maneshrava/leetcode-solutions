class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int m = k;
        for(int i = 0 ; i<=nums.length-1 ; i++){
            if(nums[i] == k){
                k=k+m;
            }
        }
        return k;
    }
}