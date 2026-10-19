class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int len = words.length - 1;
        int result = words[len].length();
        return result;
    }
}