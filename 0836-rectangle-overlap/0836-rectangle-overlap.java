class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        
        if (rec1[2] <= rec2[0]) return false; // rec1 is left
        if (rec2[2] <= rec1[0]) return false; // rec2 is left
        if (rec1[3] <= rec2[1]) return false; // rec1 is below
        if (rec2[3] <= rec1[1]) return false; // rec2 is below
        
        return true;
    }
}