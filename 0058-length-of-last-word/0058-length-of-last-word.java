class Solution {
    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        int i = s1.length;   
        return s1[i - 1].length();
    }
}