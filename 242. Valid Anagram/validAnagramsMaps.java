class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> resultMap = new HashMap<>();
        if (s.length() == t.length()) {
            for(int i=0;i<s.length();i++){
            resultMap.put(s.charAt(i), resultMap.getOrDefault(s.charAt(i), 0) + 1);
            resultMap.put(t.charAt(i), resultMap.getOrDefault(t.charAt(i), 0) - 1);
            }
            for (Integer value : resultMap.values()) {
                if (value != 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
