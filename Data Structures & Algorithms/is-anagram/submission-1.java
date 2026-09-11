class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m) {
            return false;
        }

        // We may sort both arrays but this will result in
        // a O(nlogn + mlogm). There must be a better way.

        int[] sFrequency = new int[26];
        int[] tFrequency = new int[26];
        int length = n;
        for(int i = 0; i < length; i++) {
            sFrequency[s.charAt(i) - 'a']++;
            tFrequency[t.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(sFrequency[i] != tFrequency[i]) {
                return false;
            }
        }

        return true;
    }
}
