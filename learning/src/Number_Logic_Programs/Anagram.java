package Number_Logic_Programs;
import java.util.Arrays;
public class Anagram {
	public static boolean isAnagram(String s1,String s2) {
		System.out.println("the length :"+s1.length());
		System.out.println("the length :"+s2.length());
//		if(s1.length()!=s2.length()) {
//			return false;
//		}
			
		String a=s1.toLowerCase();
		String b=s2.toLowerCase();
		char[]ch1=a.toCharArray();
		char[]ch2=b.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("not an Anagram");
		}
		return true;
	}
	public static void main(String[] args) {
		
	    isAnagram("eat","ate");
	    System.out.println("=================");
	    isAnagram("pen","pencil");
		
	}

}
