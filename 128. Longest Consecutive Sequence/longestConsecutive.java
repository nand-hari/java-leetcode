class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (int s : set) {
            if (!set.contains(s - 1)) {
                int len = 1;
                while (set.contains(s + len)) {
                    len++;
                }
                longest = Math.max(len, longest);
            }
        }
        return longest;
    }
}
