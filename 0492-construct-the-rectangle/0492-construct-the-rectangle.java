class Solution {
    public int[] constructRectangle(int area) {
        
        ArrayList<Integer> dynamicArray = new ArrayList<>();
        for(int i = 1 ; i<=area ; i++){
            if(area%i == 0){
                dynamicArray.add(i);
            }
        }

        int[] arr = new int[dynamicArray.size()];
        for (int i = 0; i < dynamicArray.size(); i++) {
            arr[i] = dynamicArray.get(i);
        }

        int[] num = new int[2];

        if(arr.length % 2 == 0 ){
            num[0] = arr[arr.length/2];
            num[1] = arr[arr.length/2 - 1];
        }
        else{
            num[0] = arr[arr.length/2];
            num[1] = arr[arr.length/2];
        }
        return num;
    }
}