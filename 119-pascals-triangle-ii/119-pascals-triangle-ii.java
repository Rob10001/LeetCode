class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> main = new ArrayList<List<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        temp.add(1); main.add(temp); temp = new ArrayList<>(temp);
        for(int i = 0; i < rowIndex; i++){
            temp.clear();
            temp.add(1);
            for(int j = 0; j < main.get(main.size()-1).size() - 1; j++)
                temp.add(main.get(main.size()-1).get(j) + main.get(main.size()-1).get(j + 1));
            temp.add(1);
            main.add(temp);
            temp = new ArrayList<>(temp);
        }
        return main.get(main.size() - 1);
    }
}