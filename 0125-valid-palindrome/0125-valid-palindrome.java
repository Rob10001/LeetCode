class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        String alphNum = "";
        for(int i = 0; i < s.length(); i++) 
            if(Character.isLetterOrDigit(s.charAt(i))) 
                alphNum += s.substring(i, i+1);
        for(int i = 0; i < alphNum.length(); i++)
            if(alphNum.charAt(i) != alphNum.charAt(alphNum.length() - 1 - i))
                return false;
        return true;
    }
}