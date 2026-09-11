class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Using Map

        Map<Integer, Integer> diffs = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(diffs.containsKey(nums[i])) {
                return new int[]{diffs.get(nums[i]), i};
            }

            diffs.put(diff, i);
        }

        return null;
    }
}
