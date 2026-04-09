package Number_Logic_Programs;

public class Spy_Number {
	
		public static void main(String[] args) {
		int num=123;
        int temp=num;
			int sum=0;
			int product=1;
			while(temp>0) {
				int rem=temp%10;
				sum=sum+rem;
				product *=rem;
				temp=temp/10;
				
			}
			System.out.println((sum==product)? "spy number":"Not a spy Number");
		}

	}





