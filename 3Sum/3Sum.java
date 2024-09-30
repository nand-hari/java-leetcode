class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> output = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
           int j = i + 1;
           int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                List<Integer> list = new ArrayList<>();
                if (sum == 0) {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    output.add(list);
                    j++;
                    k--;
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }

            }
        }
        return new ArrayList<List<Integer>>(output);

    }
}

//time - O(n2)
//space- O(n2)
