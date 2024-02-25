class Solution {
    public boolean repeatedSubstringPattern(String s) {
        //  start at 0, check if that substring of length 1 works
        //  still at 0, increase length until its half length of s, see if that works
        if(s.length() == 1) return false;
        
        boolean works = false;
        for(int len = 1; len <= Math.ceil(s.length()/2.0); len++) {
            works = true;
            
            if(s.length() % len == 0) {
                for(int i = 0; i <= s.length() - len; i += len)
                    if(!s.substring(i, i + len).equals(s.substring(0, len)))
                        works = false;
                if(works) return works;
                
            } else {
                works = false;
            }
        }
        
        return works;
    }
}