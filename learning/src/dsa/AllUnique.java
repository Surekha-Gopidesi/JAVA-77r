package dsa;

public class AllUnique {
	public static void main(String[] args) {
		boolean flag=true;
		String str="Hello";
		System.out.println("All the unique characters:");
		for(int i=0;i<str.length();i++) {
			int count=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;	
				}
				
			}
			if(count==1) {
		
			 System.out.print(str.charAt(i)+" ");
			}
		}
		
		

	}
}
