package dsa.day3;

public class Strong {
	public static void sample(int n) {
		int temp=n;
	int sum=0;
		while(n>0) {
			int rem=n%10;
			int fact=1;
			for(int i=rem;i>0;i--) {
				fact=fact*i;
			}
			n=n/10;
			sum=sum+fact;
		}
		System.out.println(sum);
		if(sum==temp) {
			System.out.println("strong Number");
		}
		else {
			System.out.println("Not a Strong Number");
		}
	}
	public static void main(String[] args) {
		sample(145);
	}
}
