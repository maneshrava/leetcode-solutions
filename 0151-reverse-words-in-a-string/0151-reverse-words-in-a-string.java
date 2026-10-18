
class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");
        String[] result = new String[word.length];

        int j = 0;

        for (int i = word.length - 1; i >= 0; i--) {
            result[j] = word[i];
            j++;
        }

        return String.join(" ", result);
    }
}
