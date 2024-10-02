class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = s.length() - 1;

        while (len >= 0 && s.charAt(len) != ' ') {
            len--;
        }
        return s.length() - len - 1;
    }
}
//Time - O(n) 
//Space - O(1)
