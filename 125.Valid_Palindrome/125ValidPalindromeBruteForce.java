class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (Character.isLetterOrDigit(temp)) {
                st.append(Character.toLowerCase(temp));
            }
        }
        return st.toString().equals(st.reverse().toString());
    }
}
