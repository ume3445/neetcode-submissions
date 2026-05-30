class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
            if (s.length() != t.length()){
                return false;
            } else {
                for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
                }   

                for (int i = 0; i < t.length(); i++) {
                    char c = t.charAt(i);
                    if (!map.containsKey(c)) {
                        return false;
                    } else {
                        map.put(c, map.get(c) - 1);
                    }
                }
                for (Map.Entry<Character, Integer> e : map.entrySet()) {
                    if (e.getValue() != 0) {
                        return false;
                    }
            }
        }
        return true;
    }
}
