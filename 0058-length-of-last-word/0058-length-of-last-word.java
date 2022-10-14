class Solution {
    public int lengthOfLastWord(String s) {
        Scanner chopper = new Scanner(s);
        String word = "";
        while(chopper.hasNext()) {
            word = chopper.next();
        }
        return word.length();
    }
}