class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(end >= start) {
            if(target == nums[(start + end)/2]) return (start+end)/2;
            
            if(nums[(start + end)/2] < target) {
                start = (start + end)/2 + 1;
            } else if(nums[(start + end)/2] > target) {
                end = (start + end)/2 - 1;
            }
        }
        return -1;
    }
}