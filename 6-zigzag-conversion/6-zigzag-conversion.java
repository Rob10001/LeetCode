class Solution {
    public String convert(String s, int numRows) {
        char[][] zig = new char[numRows][s.length()];
        int charCount =  0;
        int colCount = 0;
        while(charCount < s.length()){
            for(int j = 0; j < zig.length && charCount < s.length(); j++){
                zig[j][colCount] = s.charAt(charCount); charCount++;
            }
            colCount++;
            for(int j = zig.length-2; j > 0 && charCount < s.length(); j--) {
                zig[j][colCount] = s.charAt(charCount); charCount++; colCount++;
            }
        }
        String printS = "";
        for(char[] r : zig)
            for(char c : r)
                if((int)c != 0)
                    printS += c;
        return printS;
    }
}