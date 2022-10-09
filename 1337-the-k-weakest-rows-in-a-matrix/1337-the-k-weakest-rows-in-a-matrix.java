class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] strength = new int[mat.length];
        int[] strIndex = new int[mat.length];
        int currStrength;
        for(int i = 0; i < mat.length; i++) {
            currStrength = 0;
            for(int j = 0; j < mat[i].length; j++)
                if(mat[i][j] == 1) currStrength++;
            strength[i] = currStrength;
            strIndex[i] = i;
        }
        int temp;
        for(int i = 0; i < mat.length; i++)
            for(int j = 0; j < mat.length - 1; j++) 
                if(strength[j] > strength[j + 1]) {
                    temp = strength[j];
                    strength[j] = strength[j + 1];
                    strength[j + 1] = temp;
                    
                    temp = strIndex[j];
                    strIndex[j] = strIndex[j + 1];
                    strIndex[j + 1] = temp;
                }

        int[] weakToStrong = new int[k];
        for(int i = 0; i < k; i++)
            weakToStrong[i] = strIndex[i];
        return weakToStrong;
    }
}