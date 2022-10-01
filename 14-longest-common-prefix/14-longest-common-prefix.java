class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = strs[0];
        for(int i = 1; i < strs.length; i++) {
            if(pre.length() > strs[i].length())
                pre = pre.substring(0, strs[i].length());
            for(int j = 0; j < pre.length() && j < strs[i].length(); j++) 
                if(strs[i].charAt(j) - pre.charAt(j) != 0)
                    pre = pre.substring(0, j);
        }
        return pre;
    }
}