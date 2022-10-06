class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> main = new ArrayList<List<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        if(numRows == 0) return main;
        temp.add(1); main.add(temp); temp = new ArrayList<>(temp);
        for(int i = 1; i < numRows; i++){
            temp.clear();
            temp.add(1);
            for(int j = 0; j < main.get(main.size()-1).size() - 1; j++)
                temp.add(main.get(main.size()-1).get(j) + main.get(main.size()-1).get(j + 1));
            temp.add(1);
            main.add(temp);
            temp = new ArrayList<>(temp);
        }
        return main;
    }
}