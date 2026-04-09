package dsa;

public class FirstUnique {
	public static void main(String[] args) {
		boolean flag=true;
		String str="Surekha";
		int count=0;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					flag=false;
				}
				if(flag) {
					System.out.println(str.charAt(i));
				}
				
			}
		}

	}

}
