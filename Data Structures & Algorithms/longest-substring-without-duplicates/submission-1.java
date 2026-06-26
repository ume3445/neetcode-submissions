class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] c = new char[s.length()];
        if (s == null && s.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            char char1 = s.charAt(i);
            c[i] = char1;
        }
        int i = 0;
        int j = 1;
        set.add(c[i]);
        int size = 0;
        while (j < c.length) {
            if (set.contains(c[j])) {
                i = j;
                size = Math.max(size, set.size());
                set.clear();
                set.add(c[i]);
            } else {
                set.add(c[j]);
            }
            j++;
        }
        return Math.max(size, set.size());
    }
}
