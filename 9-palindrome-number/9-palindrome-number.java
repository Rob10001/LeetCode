class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String num = Integer.toString(x);
        String pal = "";
        for(int i = 0; i < num.length(); i++)
            pal = num.charAt(i) + pal;
        return num.equals(pal) ? true : false;
    }
}