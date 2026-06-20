class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        String collected = "";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                collected += s.charAt(i);
            }
        }
        StringBuilder result = new StringBuilder();
        int j = collected.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                result.append(collected.charAt(j--));
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}