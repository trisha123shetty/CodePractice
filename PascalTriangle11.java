//Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> l = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<=n;i++){
                 l = new ArrayList<>();  
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    l.add(1);
                }
                else{
                    l.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }

            }
            ans.add(l);
           
        }
       return ans.get(n);
    }
}