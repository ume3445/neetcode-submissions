class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        for (int k = 0; k < s1.length(); k++) {
            map.put(s1.charAt(k), map.getOrDefault(s1.charAt(k), 0) + 1);
        }
        boolean res = false;
        int need = s1.length();
        while (j < s2.length()) {
            if (map.getOrDefault(s2.charAt(j), 0) > 0) {
                map.put(s2.charAt(j), map.getOrDefault(s2.charAt(j), 0) - 1);
                need--;
                j++;
            } else {
                j++;
            }
            if ((j-i) == s1.length()) {
                if (need == 0) {
                    res = true;
                } else {
                    if (map.containsKey(s2.charAt(i))) {
                        map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) + 1);
                        if (map.getOrDefault(s2.charAt(i), 0) > 0) {
                            need++;
                        }
                    }
                }
                i++;
            } 
        }
        return res;
    }
}

