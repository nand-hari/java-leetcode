class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) { //3
            for (int j = i + 1; j < nums.length; j++) { //3
                if (target == nums[i] + nums[j]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};

    }
}

// Time complexity - O(n2)
// Space complexity - O(1)
