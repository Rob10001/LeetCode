class Solution {
    public int lengthOfLastWord(String s) {
        String word = "";
        s = s.trim();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') word = "";
            else word += s.charAt(i);
        }
        return word.length();
    }
}