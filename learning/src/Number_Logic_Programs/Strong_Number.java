package Number_Logic_Programs;

public class Strong_Number {
	public static void num(int num) {
		int temp=num;
		int sum=0;
		while(num>0) {
		int rem=num%10;
		int fact=1;
		for(int i=1;i<=rem;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
		}
		if(sum==temp) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not a Strong Number ");
		}
		}
	
	public static void main(String[] args) {
		num(145);
		num(10);
		
	}
}
