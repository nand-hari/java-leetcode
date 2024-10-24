class Solution {
    public boolean isAnagram(String s, String t) {

     char[] sArr=s.toCharArray();
     Arrays.sort(sArr);
     String input1=new String(sArr);
    
    char[] tArr=t.toCharArray();
    Arrays.sort(tArr);
    String input2=new String(tArr);

    return input1.equals(input2);
    }}
//O(nlogn)
//O(N*M)
