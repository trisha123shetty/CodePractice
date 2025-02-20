class Solution {
    public String removeOuterParentheses(String s) {
        //brute
        // int counter=0;
        // String ans="";
        // for(int i=0;i<s.length();i++){
        //     if(counter==0){
        //         counter++;
        //     }else{
        //         if(s.charAt(i)==')'){
        //             counter--;
        //         }else{
        //             counter++;
        //         }
        //         if(counter>0){
        //                                 ans+=s.charAt(i);

        //         }
        //     }
        // }
        // return ans;

        //optimal
        StringBuilder ans= new StringBuilder(s.length());
        int counter=0;
       
     for(int i=0;i<s.length();i++){
        if(counter==0){
            counter++;
        }else{
            if(s.charAt(i)=='('){
                counter++;
            }else{
                counter--;
            }
            if(counter>0){
                ans.append(s.charAt(i));
            }
        }
     }
     return ans.toString();
    }
}