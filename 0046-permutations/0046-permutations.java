class Solution {
    public static List<List<Integer>> results = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        combos(nums, used, new ArrayList<Integer>());
        List<List<Integer>> output = new ArrayList<>(results);
        results.clear();
        return output;
    }
    
    public static void combos(int[] nums, boolean[] used, ArrayList<Integer> currStack) {
        for(int i = 0; i < nums.length; i++) {
            if(!used[i]) {
                ArrayList<Integer> recurse = new ArrayList<Integer>(currStack);
                recurse.add(nums[i]);
                
                used[i] = true;
                combos(nums, used, recurse);
                used[i] = false;
            }
        }
        
        boolean goodToGo = true;
        for(boolean b : used) {
            if(!b) goodToGo = false;
        }
        if(goodToGo) results.add(currStack);
    }
}