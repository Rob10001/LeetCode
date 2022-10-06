class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1 || s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') return false;
        boolean hasClose = false;
        ArrayList<Character> open = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                open.add(s.charAt(i)); hasClose = false;
            }
            else{
                hasClose = true;
                if(s.charAt(i) == ')'){
                    if(open.size() > 0 && open.get(open.size() - 1) == '(')
                        open.remove(open.size() - 1);
                    else
                        return false;
                } else if(s.charAt(i) == '}'){
                    if(open.size() > 0 && open.get(open.size() - 1) == '{')
                        open.remove(open.size() - 1);
                    else
                        return false;
                } else {
                    if(open.size() > 0 && open.get(open.size() - 1) == '[')
                        open.remove(open.size() - 1);
                    else
                        return false;
                }
            }
        }
        return open.size() != 0 ? false : true&&hasClose;
    }
}