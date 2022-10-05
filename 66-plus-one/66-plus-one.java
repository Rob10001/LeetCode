class Solution {
    public int[] plusOne(int[] digits) {
        
        digits[digits.length - 1] += 1;
        
        if(digits[digits.length - 1]  > 9) {
            int i = digits.length - 1;
            while(digits[i] > 9) {
                if(i > 0){
                    digits[i - 1] += digits[i] / 10;
                    digits[i] = digits[i] % 10; i--;
                } else {
                    int[] larger = new int[digits.length + 1];
                    larger[0] = digits[i] / 10;
                    digits[i] = digits[i] % 10; 
                    for(int j = 0; j < digits.length; j++) {
                        larger[j + 1] = digits[j];
                    }
                    return larger;
                }
            }
        }
        return digits;
    }
}