class Solution {
    public int maxDepth(String s) {
        int counter=0;
        int res=0;
        for(int i=0;i<s.length();i++){
          
                if(s.charAt(i)=='('){
                    counter++;
                    res=Math.max(counter,res);
                }else if (s.charAt(i) == ')') {
                    counter--;
                }
            
        }
        return res;
    }
}