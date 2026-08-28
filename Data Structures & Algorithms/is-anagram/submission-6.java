/*
inputs we have two strings s and t
we need to output a boolean if they are anagrams
So what we do is put both of them in an array and then sort the array
And then if the arrays are equal we will have an anagram
One thing that I will check before everything is that is the length same if not it can not be an anagram
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
}
