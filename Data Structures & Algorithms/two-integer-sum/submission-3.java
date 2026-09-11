class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Using Map

        Map<Integer, Integer> diffs = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            Integer existingDiff = diffs.get(nums[i]);
            if(existingDiff != null) {
                return new int[]{existingDiff, i};
            }

            diffs.put(diff, i);
        }

        return null;
    }
}
