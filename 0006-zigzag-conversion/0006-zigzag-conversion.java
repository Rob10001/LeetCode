class Solution {
    public String convert(String s, int numRows) {
        List<Character>[] grid = new ArrayList[numRows];
        for(int i = 0; i < grid.length; i++) {
            grid[i] = new ArrayList<Character>();
        }
        
        int c = 0;
        int row;
        while(c < s.length()) {
            for(row = 0; c < s.length() && row < numRows; row++) {
                grid[row].add(s.charAt(c)); c++;
            }
            for(row -= 2; c < s.length() && row > 0; row--) {
                grid[row].add(s.charAt(c)); c++;
            }
        }
        
        String output = "";
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].size(); j++) {
                output += grid[i].get(j);
            }
        }
        
        return output;
    }
}