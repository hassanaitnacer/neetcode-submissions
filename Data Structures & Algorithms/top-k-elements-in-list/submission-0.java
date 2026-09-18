class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for(int num : nums) {
            frequency.merge(num, 1, Integer::sum);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> frequency.get(a) - frequency.get(b));
        for(int num : frequency.keySet()) {
            heap.offer(num);

            if (heap.size() > k) {
                heap.poll();
            }
        }

        return heap.stream().mapToInt(Integer::intValue).toArray();
    }
}
