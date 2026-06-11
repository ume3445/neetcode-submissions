class Solution {
    public boolean isAnagram(String s, String t) {
            char ch1[];
            char ch2[];
            ch1 = s.toCharArray();
            ch2 = t.toCharArray();
            int sum1 = 0;
            int sum2 = 0;
            boolean anagram = false;
            for(int i = 0; i < s.length(); i++) {
                sum1 = sum1 + ch1[i];
            }
            for(int i = 0; i < t.length(); i++) {
                sum2 = sum2 + ch2[i];
            }
            if (sum1 == sum2) {
                anagram = true;
            } 
        return anagram;
    }
}
