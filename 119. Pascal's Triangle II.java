public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l = new ArrayList<Integer>(Collections.nCopies(rowIndex+1,0));
        int prev = 0;
        int val;
        l.set(0,1);
        for(int i = 1 ; i <= rowIndex ; i++){
            for(int j = i ; j > 0 ; j--){
                l.set(j,l.get(j) + l.get(j-1));
            }
        }
        return l;
    }
}