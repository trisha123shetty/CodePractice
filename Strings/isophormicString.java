
public class isophormicString {

	public static boolean isophormicFunction(String s1, String s2) {
		char[] freq= new char[26];
		if(s1.length()!= s2.length()) {
			return false;
		}else {
			for(int i=0;i<s1.length();i++) {
				int ch=s1.charAt(i);
				int index=ch-97;
				if(freq[index]!='\u0000' && freq[index]!=s2.charAt(i) ) {
					return false;
				}else {
					freq[index]=s2.charAt(i);

				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="foo";
		String s2="bom";
		boolean ans=isophormicFunction(s1,s2);
		System.out.println(ans);

	}

}
