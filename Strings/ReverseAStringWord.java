class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
		String result="";
		result=sb.reverse().toString();
		System.out.println(result);
		String ans="";
		StringBuilder words = new StringBuilder();
		for(int i=0;i<result.length();i++) {
			while(i<result.length() && result.charAt(i)!=' ') {
				words.append(result.charAt(i));
				i++;
			}
			words.reverse();
			if(words.length()>0) {
			ans+=" "+words.toString();
			}
		    words.setLength(0);
		}
        return ans.substring(1);
    }
}