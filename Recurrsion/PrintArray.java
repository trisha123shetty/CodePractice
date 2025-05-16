//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printn(int i, int[] arr){
        if(i==arr.length)
        {
            return;
        }
        System.out.println(arr[i]);
        printn(i+1,arr);
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
   int[] arr={1,2,3};
   printn(0,arr);
    }
}