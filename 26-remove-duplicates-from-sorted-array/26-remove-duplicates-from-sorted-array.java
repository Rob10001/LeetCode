class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        for(int i = nums.length - 2; i > -1; i--) {
            if(nums[i] == nums[i+1]){
                for(int j = i; j < nums.length - 1; j++){
                    nums[j] = nums[j + 1];
                }
                k--;
            }
        }
        return k;
    }
}