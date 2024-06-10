class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[] {-1, -1};
        if(nums.length == 2) return nums[0] == target && nums[1] == target ? new int[]{0, 1} : nums[0] == target ? new int[]{0, 0} : nums[1] == target ? new int[]{1, 1} : new int[]{-1,-1};
        
        //find left
        int min = 0;
        int max = nums.length;
                                                      //problem with [2,2] t:2  here  //
        while((max - min) > 1 && (max + min)/2 > 0 && (max + min)/2 != nums.length - 1 && (nums[(max + min)/2] != target || (nums[(max + min)/2] == target && nums[(max + min)/2 - 1] == target))) {
            //System.out.println("LEFT min: " + min + "\tmax: " + max + "\tmid: " + (max + min)/2);

            if(target <= nums[(max + min)/2]) {
                max = (max + min)/2;
            } else if(target > nums[(max + min)/2]) {
                min = (max + min)/2;
            }
        }
        int bottomIndex = (nums[(max + min)/2] == target) && ((max + min)/2 == 0 || nums[(max + min)/2 - 1] != target) ? (max + min)/2 : -1;
        
        
        
        //find right
        min = 0;
        max = nums.length;
        
        while((max - min) > 1 && (max + min)/2 != 0 && (max + min)/2 < nums.length - 1 && (nums[(max + min)/2] != target || (nums[(max + min)/2] == target && nums[(max + min)/2 + 1] == target))) {
            //System.out.println("RIGHT min: " + min + "\tmax: " + max + "\tmid: " + (max + min)/2);

            if(target >= nums[(max + min)/2]) {
                min = (max + min)/2;
            } else if(target < nums[(max + min)/2]) {
                max = (max + min)/2;
            }
        }
        int topIndex = (nums[(max + min)/2] == target) && ((max + min)/2 == nums.length - 1 || nums[(max + min)/2 + 1] != target) ? (max + min)/2 : -1;
        
        
        
        return new int[] {bottomIndex, topIndex};
    }
}