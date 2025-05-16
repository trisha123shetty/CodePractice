public class SkipACharacter {
    public static void SkipACharacter(int i, String s, String ans){
        if(i==s.length()){
            System.out.print(ans);
            return;

        }
        if(s.charAt(i)!='a') {
            ans += s.charAt(i);

        }
        SkipACharacter(i+1,s,ans);

    }
    public static void main(String[] args) {
        String s= "Tasha";
        SkipACharacter(0,s," ");
    }
}
