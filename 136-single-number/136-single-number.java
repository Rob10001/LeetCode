class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> numList = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(numList.contains(nums[i])) 
                numList.remove(Integer.valueOf(nums[i]));
            else 
                numList.add(nums[i]);
        }
        return numList.get(0);
    }
}