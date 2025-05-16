public class PrintString {
public static void printString(int i, String s){
    if(i==s.length()){
        return;
    }
    System.out.print(s.charAt(i));

    printString(i+1,s);
    }
    public static void main(String[] args) {
        String s= "Trisha m shetty";
        printString(0,s);
    }
}
