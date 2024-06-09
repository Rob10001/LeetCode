class Solution {
    public static ArrayList<String> combos = new ArrayList<String>();
    public static String[][] letters = {{},{},
                                {"a" , "b", "c"},
                                {"d" , "e", "f"},
                                {"g" , "h", "i"},
                                {"j" , "k", "l"},
                                {"m" , "n", "o"},
                                {"p" , "q", "r", "s"},
                                {"t" , "u", "v"},
                                {"w" , "x", "y", "z"}};
    
    
    
    public List<String> letterCombinations(String digits) {
        if(digits.equals("")) return combos;
        
        recurse(digits, 0, "");
        ArrayList<String> output = new ArrayList<>(combos);
        combos.clear();
        return output;
    }
    
    
    public void recurse(String digits, int position, String currStack) {
        if(position == digits.length()) {
            combos.add(currStack);
            return;
        }
        
        
        //for each possible char for a given digit
        for(String c : letters[digits.charAt(position) - 48]) {
            recurse(digits, position + 1, currStack + c);
        }
    }
}