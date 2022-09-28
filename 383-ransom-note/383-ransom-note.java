import java.util.ArrayList;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        ArrayList<String> magList = new ArrayList<String>();
        for(int i = 0; i < magazine.length(); i++) {
            magList.add(Character.toString(magazine.charAt(i)));
        }
        char[] ranArr = ransomNote.toCharArray();
        
        for(char c : ranArr) {
            if(magList.contains(Character.toString(c))) {
                magList.remove(Character.toString(c));
            } else {
                return false;
            }
        }
        return true;
    }
}