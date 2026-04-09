package Number_Logic_Programs;

public class Perfect {
	public static void perfect(int num){
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		System.out.println((sum==num)?"Perfect Number":"Not a perfect Number");
	}
	public static void main(String[] args) {
		perfect(28);
		

	}

}
