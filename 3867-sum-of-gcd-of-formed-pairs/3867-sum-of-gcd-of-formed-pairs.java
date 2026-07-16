class Solution {
    private int gcd(int a , int b){
        while(b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }

    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] mx = new int[n];
        mx[0] = nums[0];

        for(int i = 1 ; i<n ; i++){
            mx[i] = Math.max( mx[i-1] , nums[i]);
        }

        int[] pre = new int[n];
        for(int i = 0 ; i<n ; i++){
            pre[i] = gcd(nums[i],mx[i]);
        }

        Arrays.sort(pre);

        long sum = 0;

        int l = 0;
        int r = n-1;

        while(l<r){
            sum+=gcd(pre[r] , pre[l]);
            l++;
            r--;
        }
        return sum;    
    }   
}