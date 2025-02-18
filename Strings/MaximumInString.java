
public class MaximumInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"21","0078","20"};
		String max=arr[0];
		for(int i=0;i<arr.length;i++) {
			max=maximum(max,arr[i]);
		}
		System.out.println(max);
	}
	public static String maximum(String a, String b) {
		String s=purify(a);
		String s2=purify(b);
		if(s.length()>s2.length()) return a;
		if(s2.length()>s.length()) return b;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=s2.charAt(i)) {
				if(s.charAt(i)>s2.charAt(i)) {
					return a;
				}else {
					return b;
				}
			}
		}
		if(a.length()>b.length())
			return a;
		else
			return  b;
		
	}
public static String purify(String s) {
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!='0') {
			return s.substring(i);
		}
	}
	return s;
}
}
