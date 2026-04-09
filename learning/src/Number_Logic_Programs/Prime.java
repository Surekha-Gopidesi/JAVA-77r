package Number_Logic_Programs;

public class Prime {
	public static boolean isprime(int num) {
		boolean isprime=true;
		int count=0;
		if(num<=1) {
			return false;
			
		}
		for(int i=2;i*i<=num;i++) {
			if(num%i==0){
				count ++;	
			}
		}if(count>2) {
			return false;
		}
		return true;
	
	}
	public static void main(String[] args) {
		boolean  res=isprime(17);
		System.out.println(res?"prime":"not a prime");
	}


}
