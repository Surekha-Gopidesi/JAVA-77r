package dsa;

public class FrequencyUnique {
	public static void main(String[] args) {
		
		String str="Hello world";
		boolean arr[]=new boolean[str.length()];
		System.out.println("Frequency of characters:");
		for(int i=0;i<str.length();i++) {
			int count=0;
			if(arr[i]==true) {
				continue;
			}
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					arr[j]=true;
				}
				
			}
			if(count>1) {
		
			 System.out.println(str.charAt(i)+" :"+count);
			}
		}
	}

}
