public class SubsetsOfString {
    public static void printSubset(int i, String s, String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;

        }
        char ch= s.charAt(i);

        printSubset(i+1,s,ans+ch);//take
        printSubset(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s= "abc";
        printSubset(0,s,"");
    }
}
