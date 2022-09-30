class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        for(int i = 0; i < accounts.length; i++){
            int currRich = 0;
            for(int j = 0; j < accounts[i].length; j++) 
                currRich += accounts[i][j];
            richest = currRich > richest ? currRich : richest;
        }
        return richest;
    }
}