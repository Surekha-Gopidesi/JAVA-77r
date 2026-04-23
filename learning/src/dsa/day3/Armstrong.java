 package dsa.day3;

public class Armstrong {
	
	public void amstrong(int start,int end) {
		while(start<end) {
			int n=start;
			int count=0;
			for(int i=n;i>0;i=i/10) {
				count++;
			}
			int sum=0;
			while(n>0) {
				int temp=n%10;
				sum=sum+temp;
				n=n/10;
			}
			if(start==sum) {
				System.out.println(start);
			}
			start++;
			
		}
	}

	public static void main(String[] args) {
		Armstrong a=new Armstrong();
		a.amstrong(1,100000);
		

	}

}
