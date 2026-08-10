class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m = flowerbed.length;
        if(n==0 || (m==1 && flowerbed[0]==0)){
            return true;
        }
        
        if(flowerbed[0] == 0 && flowerbed[1] == 0 ){
            flowerbed[0] = 1;
            n--;
        }
        
        for(int i = 1 ; i<m-1 ; i++){
            if(flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i-1] ==0 ){
                n--;
                flowerbed[i] = 1;
            }
        }

        if(flowerbed[m-1] == 0 && flowerbed[m-2]==0){
            flowerbed[m-1] = 1;
            n--;
        }

        if(n>0){
            return false;
        }
       return true; 
    }
}