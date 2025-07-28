class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            int total = numbers[first] + numbers[last];
            if (total == target) {
                return new int[] { first + 1, last + 1 };
            } else if (total > target) {
                last--;
            } else {
                first++;
            }
        }
        return new int[] { -1, -1 };

    }
}

// time comp- O(n)
// space comp- O(1)
