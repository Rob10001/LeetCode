class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        for(int i = nums.length - 1; i > -1; i--) {
            if(nums[i] == val){
                k--;
                for(int j = i; j < k; j++){
                    nums[j] = nums[j + 1];
                }
            }
        }
        return k;
    }
}