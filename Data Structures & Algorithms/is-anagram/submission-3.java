class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < ch1.length; i++) {
            if (map1.containsKey(ch1[i])) {
                map1.put(ch1[i], map1.get(ch1[i]) + 1);
            } else {
                map1.put(ch1[i], 1);
            }
        }

        for (int i = 0; i < ch2.length; i++) {
            if (map2.containsKey(ch2[i])) {
                map2.put(ch2[i], map2.get(ch2[i]) + 1);
            } else {
                map2.put(ch2[i], 1);
            }
        }
        boolean valid = true;
        for (Character key : map1.keySet()) {
            if (!map2.containsKey(key) || !map2.get(key).equals(map1.get(key))) {
                valid = false;
            } 
        }
        return valid;
    }
}
