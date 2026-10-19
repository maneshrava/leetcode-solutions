class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");
        String[] result = new String[word.length];
        for(int i = 0 ; i<word.length ; i++){
            StringBuilder sb = new StringBuilder(word[i]);
            sb.reverse();
            result[i] = sb.toString();
        }
        return String.join(" ",result);
    }
}