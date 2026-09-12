class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String s : strs) {
            String key = Arrays.toString(charFrequency(s));

            groups.computeIfAbsent(key, k -> new ArrayList<>())
                  .add(s);
        }

        return new ArrayList<>(groups.values());
    }

    private int[] charFrequency(String s) {
        int[] frequency = new int[26];

        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }

        return frequency;
    }
}
