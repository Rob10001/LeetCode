class Solution {
    public static ArrayList<String> results = new ArrayList<String>();
    
    public List<String> generateParenthesis(int n) {
        combos(n, n, "");
        ArrayList<String> output = new ArrayList<String>(results);
        results.clear();
        return output;
    }
    
    public static void combos(int toOpen, int toClose, String currStack) {
        if(toOpen == 0 && toClose == 0) {
            results.add(currStack);
            return;
        }
        
        //new sets still to be opened
        if(toOpen != 0) {
            combos(toOpen - 1, toClose, currStack + "(");
        }
        
        //open set still needs to be closed
        if(toClose > toOpen) {
            combos(toOpen, toClose - 1, currStack + ")");
        }
    }
}