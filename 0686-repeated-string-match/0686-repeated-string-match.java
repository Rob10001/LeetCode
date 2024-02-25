class Solution {
    public int repeatedStringMatch(String a, String b) {
       //know we must stop after one more try when our long A is length greater than b
        //a * n + a - 1 = b
        
//         String aLong = "";
//         int mult = 0;
//         do {
//             aLong += a;
//             mult++;
//         } while(aLong.length() - (a.length() - 1) < b.length());
//         return aLong.contains(b) ? mult : -1;
        
        
        
        String aLong = a;
        int mult = 1;
        
        while(aLong.length() - (a.length() - 1) < b.length()) {
            if(aLong.contains(b)) return mult;
            aLong += a;
            mult++;
        }
        return aLong.contains(b) ? mult : -1;
    }
}