class Solution {
    public int countCommas(int n) {
        int rem = 0;
        int div = 0;
        if(n<1000){
            return 0;
        }
        else{
            rem = n%1000;
            div = n/1000;
        }
        int count = ((div-1)*1000) + rem + 1;
        return count;
    }
}