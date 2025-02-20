class Solution {
    public static boolean isPalindrome(String s) {
	int i=0, j=s.length()-1;
	while(i<j) {
		if(s.charAt(i)==s.charAt(j)) {
			i++;
			j--;
		}else {
			return false;
		}
	}
	return true;
}
    public String longestPalindrome(String s) {
        String longest="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++){
				String subString=s.substring(i,j);
				Boolean flag =isPalindrome(subString);
				if(flag==true) {
					if(longest.length()<subString.length()) {
						longest=subString;
					}
				}
//				System.out.println(s.substring(i,j));
				
			}
		}
        return longest;
    }

}