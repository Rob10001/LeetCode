class Solution {
    public int reverse(int x) {
        int reverse = 0;
        long temp = 0;
        while(Math.abs(x) > 0) {
            temp = (long)reverse;
            if(Math.abs(temp * 10) > Integer.MAX_VALUE || Math.abs(temp * 10 + x % 10) > Integer.MAX_VALUE) {
                reverse = 0; x = 0;
            }
            
            reverse *= 10;
            reverse += x % 10;
            x /= 10;
        }
        return reverse;
    }
}