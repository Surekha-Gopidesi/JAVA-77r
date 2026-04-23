package dsa;

public class LongestPalindrome {
	

	public static void main(String[] args) {
		String s="surekha";
		String longest="";
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i;j<s.length();j++) {
				String str=s.substring(i,j+1);
				if(str.length()>=2) {
					if(ispalindrome(str)) {
						if(str.length()>longest.length()) {
							longest=str;
						}
					}
				}
			}
		}
		System.out.println(longest.length()>=1?longest:"not palindrome");
	}

	private static boolean ispalindrome(String str) {
//		StringBuilder sb=new StringBuilder(str);
//		sb.reverse();
//		boolean sc=str.equals(sb.toString());
//		return sc;
		return str.equals(new StringBuilder(str).reverse().toString());
	}

	}


