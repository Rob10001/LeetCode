class Solution {
    public ArrayList<String> result = new ArrayList<String>();
    
    public List<String> letterCasePermutation(String s) {
        recurse(s, 0);
        return result;
    }
    
    public void recurse(String s, int position) {
        if(position == s.length()) {
            result.add(s);
            return;
        }
        if(!Character.isLetter(s.charAt(position))) {
            recurse(s, position + 1);
            return;
        }
        
        
        //run original letter path
        recurse(s, position + 1);
        //run alt letter (lower/upper)
        recurse(s.substring(0, position) + (s.charAt(position) >= 97 ? (char)(s.charAt(position) - 32) : (char)(s.charAt(position) + 32)) + s.substring(position + 1, s.length()), position + 1);
    }
}