class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";
        for (int i = 0; i < strs.size(); i++) {
            encodedString += strs.get(i).length() + strs.get(i);
        }
        return encodedString;
    }

    public List<String> decode(String str) {
        ArrayList<String> list = new ArrayList<>();
        String answer = "";
        for (int i =0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int length = Character.getNumericValue(c);
                for (int j = i + 1; j < i + length + 1; j++) {
                    char d = str.charAt(j);
                    answer += d;
                }
                list.add(answer);
                answer = "";
            } else {
                continue;
            }
        }
        return list;
    }
}
