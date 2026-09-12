class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String frequency = Arrays.toString(charFrequency(strs[i]));
            List<String> group = anagramGroups.getOrDefault(frequency, new ArrayList<>());
            group.add(strs[i]);
            anagramGroups.put(frequency, group);
        }

        return new ArrayList<>(anagramGroups.values());
    }

    private int[] charFrequency(String s) {
        int[] frequency = new int[26];
        for(int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }

        return frequency;
    }
}
